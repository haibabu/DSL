/*
* generated by Xtext
*/
package com.babu.xtext.cct.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MyCCTAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("com/babu/xtext/cct/parser/antlr/internal/InternalMyCCT.tokens");
	}
}
