/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiniJava;

import java.util.List;
public class Program extends Stmt.Compound {
    public List<Decl> ld;
    public Program(List<Decl> ld, List<Stmt> ls){
	super(ls);
	this.ld = ld;
    }
    public String toString(){
	String ret="" ;
	for (Decl d: ld) ret += d;
	for (Stmt s: ls) ret += s;
	return ret;
    }
    public void accept(MinijavaVisitor v){
	if (!v.preVisit(this)) return;
	for (Decl d: ld) d.accept(v);
	for (Stmt s: ls) s.accept(v);
	v.postVisit(this);
    }
}