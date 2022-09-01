package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ao  reason: default package */
/* loaded from: classes.dex */
public final class ao extends au implements agq, pa, AbstractC0079pg, ajc, bl {
    final /* synthetic */ ap a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(ap apVar) {
        super(apVar, apVar, new Handler());
        this.a = apVar;
    }

    @Override // defpackage.afv
    public final afq I() {
        return this.a.d;
    }

    @Override // defpackage.ajc
    public final ajb J() {
        return this.a.J();
    }

    @Override // defpackage.au, defpackage.ar
    public final View a(int i) {
        return this.a.findViewById(i);
    }

    @Override // defpackage.agq
    public final aqr at() {
        return this.a.at();
    }

    @Override // defpackage.au, defpackage.ar
    public final boolean b() {
        Window window = this.a.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.au
    public final void c() {
        this.a.hA();
    }

    @Override // defpackage.bl
    public final void d() {
    }
}
