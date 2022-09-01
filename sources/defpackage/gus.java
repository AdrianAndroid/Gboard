package defpackage;

import android.widget.ProgressBar;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gus  reason: default package */
/* loaded from: classes.dex */
public final class gus extends cd {
    final /* synthetic */ gut a;

    public gus(gut gutVar) {
        this.a = gutVar;
    }

    @Override // defpackage.cd
    public final void x(an anVar) {
        if ((anVar instanceof ai) || !anVar.s) {
            return;
        }
        gut gutVar = this.a;
        ProgressBar progressBar = gutVar.n;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        gutVar.u(0);
    }
}
