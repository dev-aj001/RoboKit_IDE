/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JComponent;
import javax.swing.JTabbedPane;
import org.fife.ui.rsyntaxtextarea.FileLocation;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rsyntaxtextarea.TextEditorPane;
import org.fife.ui.rtextarea.RTextScrollPane;

/**
 *
 * @author jairi
 */
public class FileManager {
    
    
    static ArrayList<File> file_list;
    static ArrayList<TextEditorPane> txtArea_list;

    public FileManager(ArrayList<File> file_list, ArrayList<TextEditorPane> txtArea_list) {
        this.file_list = file_list;
        this.txtArea_list = txtArea_list;
    }

    public FileManager() {
        this.file_list = new ArrayList<File>();
        this.txtArea_list = new ArrayList<TextEditorPane>();
    }
    
    public void addTab(JTabbedPane tp, String title, String parent){
        TextEditorPane tep = new TextEditorPane();
        RTextScrollPane scrll = new RTextScrollPane(tep);
        tep.setCodeFoldingEnabled(true);
        tep.setWhitespaceVisible(true);
        tep.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVA);
        
        txtArea_list.add(tep);
        file_list.add(new File(parent, title));
        tp.addTab(title, scrll);
        tp.setSelectedIndex(tp.getTabCount()-1);
    }
    
    public void removeTab(JTabbedPane tp, int index){
        int i = tp.getTabCount();
        int f = txtArea_list.size();
        //System.out.println("i: " + i + "f: " + file_list.size());
        if(f<i && f>0 && index!=0){// Existe la pestaña Welcome y al menos un codigo
            file_list.remove(index-1);
            txtArea_list.remove(index-1);
        } else if (f==i){// Existe codigo pero no la pestaña Welcome
            file_list.remove(index);
            txtArea_list.remove(index);
        }// Solo existe la pantalla Welcome
        tp.removeTabAt(index);
    }
    
    public TextEditorPane getTXT(JTabbedPane tp){
        int i = tp.getTabCount();
        int index = tp.getSelectedIndex();
        int f = txtArea_list.size();
        
        if(f<i && f>0 && index!=0){// Existe la pestaña Welcome y al menos un codigo
            
            return txtArea_list.get(index-1);
        } else if (f==i){// Existe codigo pero no la pestaña Welcome
            return txtArea_list.get(index);
        }// Solo existe la pantalla Welcome
        return null;
    }
    
    public File getFile(JTabbedPane tp){
        int i = tp.getTabCount();
        int index = tp.getSelectedIndex();
        int f = file_list.size();
        if(f<i && f>0 && index!=0){// Existe la pestaña Welcome y al menos un codigo
            return file_list.get(index-1);
        } else if (f==i){// Existe codigo pero no la pestaña Welcome
            return file_list.get(index);
        }// Solo existe la pantalla Welcome
        return null;
    }
    
    public void updateFileList(JTabbedPane tp){
        int i = tp.getTabCount();
        int index = tp.getSelectedIndex();
        int f = file_list.size();
        
        if(f<i && f>0 && index!=0){// Existe la pestaña Welcome y al menos un codigo
            System.out.println("index " + index + " sixe " + f);
            file_list.set(index-1, new File(txtArea_list.get(index-1).getFileFullPath()));
        } else if (f==i){// Existe codigo pero no la pestaña Welcome
            file_list.set(index, new File(txtArea_list.get(index).getFileFullPath()));
        }// Solo existe la pantalla Welcome
        System.out.println("Todo bien");
    }

    
    public void print(){
        int e = 0;
        Iterator i = file_list.iterator();
        while(i.hasNext()){
            System.out.println(i.next().toString() + " file" + (e++));
        }
    }
    
}
