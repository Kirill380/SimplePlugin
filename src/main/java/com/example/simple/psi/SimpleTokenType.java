package com.example.simple.psi;

import com.example.simple.SimpleLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

public class SimpleTokenType extends IElementType {
    public SimpleTokenType(@NotNull String debugName) {
        super(debugName, SimpleLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "SimpleTokenType." + super.toString();
    }
}