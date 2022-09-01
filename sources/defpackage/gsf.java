package defpackage;

import android.view.View;
import com.google.android.libraries.inputmethod.widgets.SoftKeyboardView;

/* compiled from: PG */
/* renamed from: gsf  reason: default package */
/* loaded from: classes.dex */
public final class gsf {
    public final View a;
    public final gqw b;
    public final SoftKeyboardView c;
    public final gqz d;
    public gqh e;

    public gsf(View view, SoftKeyboardView softKeyboardView, gqw gqwVar, gqz gqzVar) {
        this.a = view;
        this.b = gqwVar;
        this.c = softKeyboardView;
        this.d = gqzVar;
        this.e = a(gqzVar);
    }

    public static gqh a(gqz gqzVar) {
        return gqzVar.o(gqzVar.i() - 1);
    }
}
