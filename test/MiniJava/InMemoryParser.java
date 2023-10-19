/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiniJava;
import java.io.InputStream;

import java_cup.runtime.ComplexSymbolFactory;
import MiniJava.Program;
import MiniJava.*;

public class InMemoryParser {
	private InputStream in;
	public InMemoryParser(InputStream in) {
		this.in=in;
	}
	public Program parse() throws Exception {
		 Lexer scanner = null;
		 ComplexSymbolFactory csf = new ComplexSymbolFactory();
		 scanner = new Lexer( new java.io.InputStreamReader(in),csf );
		 Parser p = new Parser(scanner, csf);
		 return (Program)p.parse().value;
	}
}