package com.google.android.apps.inputmethod.libs.framework.keyboard;

import android.content.Context;
import com.google.android.libraries.inputmethod.keyboard.impl.Keyboard;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class PageableKeyboard extends Keyboard {
    public PageableKeyboard(Context context, hsz hszVar, ibm ibmVar, iav iavVar, ibz ibzVar) {
        super(context, hszVar, ibmVar, iavVar, ibzVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.libraries.inputmethod.keyboard.impl.Keyboard, com.google.android.libraries.inputmethod.keyboard.impl.AbstractKeyboard, defpackage.hfh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(defpackage.hfd r4) {
        /*
            r3 = this;
            iah r0 = r4.a
            iah r1 = defpackage.iah.UP
            if (r0 != r1) goto Lb
            boolean r4 = super.c(r4)
            return r4
        Lb:
            iay r0 = r4.f()
            r1 = 0
            if (r0 != 0) goto L13
            return r1
        L13:
            int r0 = r0.c
            r2 = 92
            if (r0 == r2) goto L23
            r2 = 93
            if (r0 == r2) goto L1e
            goto L29
        L1e:
            boolean r0 = r3.m()
            goto L27
        L23:
            boolean r0 = r3.o()
        L27:
            if (r0 != 0) goto L31
        L29:
            boolean r4 = super.c(r4)
            if (r4 == 0) goto L30
            goto L31
        L30:
            return r1
        L31:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.inputmethod.libs.framework.keyboard.PageableKeyboard.c(hfd):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l(deu deuVar) {
        fp(4096L, deuVar.H());
        fp(8192L, deuVar.I());
    }

    protected abstract boolean m();

    protected abstract boolean o();
}
