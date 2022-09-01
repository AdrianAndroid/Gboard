package defpackage;

import android.app.Dialog;
import android.view.View;

/* compiled from: PG */
/* renamed from: ah  reason: default package */
/* loaded from: classes.dex */
final class ah extends ar {
    final /* synthetic */ ar a;
    final /* synthetic */ ai b;

    public ah(ai aiVar, ar arVar) {
        this.b = aiVar;
        this.a = arVar;
    }

    @Override // defpackage.ar
    public final View a(int i) {
        ar arVar = this.a;
        if (arVar.b()) {
            return arVar.a(i);
        }
        Dialog dialog = this.b.d;
        if (dialog == null) {
            return null;
        }
        return dialog.findViewById(i);
    }

    @Override // defpackage.ar
    public final boolean b() {
        return this.a.b() || this.b.e;
    }
}
