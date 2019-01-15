package com.example.simple.psi;

import com.example.simple.SimpleLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

public class SimpleElementType extends IElementType {
    public SimpleElementType(@NotNull String debugName) {
        super(debugName, SimpleLanguage.INSTANCE);
    }
}