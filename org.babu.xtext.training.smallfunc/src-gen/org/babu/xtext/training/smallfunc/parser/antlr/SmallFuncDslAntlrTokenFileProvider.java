/*
* generated by Xtext
*/
package org.babu.xtext.training.smallfunc.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SmallFuncDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/babu/xtext/training/smallfunc/parser/antlr/internal/InternalSmallFuncDsl.tokens");
	}
}
