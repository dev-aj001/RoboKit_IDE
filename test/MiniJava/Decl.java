/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiniJava;

import java.util.List;
public class Decl {
    public List<Expr.Identifier> varlist;
    public Decl(List<Expr.Identifier> l){
	varlist = l;
    }
    public String toString(){
	String ret = "int "+varlist.get(0);
	for (int i = 1; i < varlist.size(); i++) ret += ","+varlist.get(i);
	return ret+";\n";
    }
    public void accept(MinijavaVisitor v){
	v.preVisit(this);
	v.postVisit(this);
    }
}