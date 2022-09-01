package com.google.android.apps.inputmethod.libs.expression.keyboard;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import com.google.android.libraries.inputmethod.keyboard.impl.Keyboard;
import com.google.android.libraries.inputmethod.keyboard.impl.KeyboardViewHolder;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class LifecycleKeyboard extends Keyboard implements afv {
    private afq fh;

    public LifecycleKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
        gp(afo.ON_CREATE);
    }

    private final void gp(afo afoVar) {
        I().c(afoVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static KeyboardViewHolder x(View view) {
        if (view == null) {
            return null;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof KeyboardViewHolder) {
                return (KeyboardViewHolder) parent;
            }
        }
        return null;
    }

    @Override // defpackage.afv
    public final afq I() {
        if (this.fh == null) {
            this.fh = new afq(this);
        }
        return this.fh;
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, java.lang.AutoCloseable
    public void close() {
        gp(afo.ON_DESTROY);
        super.close();
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public void g(EditorInfo editorInfo, Object obj) {
        gp(afo.ON_START);
        super.g(editorInfo, obj);
    }

    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, defpackage.hsy
    public void h() {
        gp(afo.ON_STOP);
        super.h();
    }
}
