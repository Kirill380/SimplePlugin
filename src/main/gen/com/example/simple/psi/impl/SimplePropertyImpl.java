// This is a generated file. Not intended for manual editing.
package com.example.simple.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.example.simple.psi.SimpleTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.example.simple.psi.*;

public class SimplePropertyImpl extends ASTWrapperPsiElement implements SimpleProperty {

  public SimplePropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull SimpleVisitor visitor) {
    visitor.visitProperty(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SimpleVisitor) accept((SimpleVisitor)visitor);
    else super.accept(visitor);
  }

  public String getKey() {
    return SimplePsiImplUtil.getKey(this);
  }

  public String getValue() {
    return SimplePsiImplUtil.getValue(this);
  }

}
