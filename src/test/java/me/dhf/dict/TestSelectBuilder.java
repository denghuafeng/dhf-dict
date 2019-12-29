package me.dhf.dict;

import me.dhf.dict.chain.EditableSelectProcessor;
import me.dhf.dict.chain.JqgridSelectProcessor;

public class TestSelectBuilder {
	public static void main(String[] args) {
		Selects.custom().addProcessorFirst(new JqgridSelectProcessor()).addProcessorLast(new EditableSelectProcessor()).setPackages("me.dhf.dict").setJsonFilePath("e:/dict").build();
	}
}
