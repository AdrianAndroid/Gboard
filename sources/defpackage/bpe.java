package defpackage;

import com.google.android.apps.inputmethod.latin.keyboard.widget.LatinFixedCountCandidatesHolderView;

/* compiled from: PG */
/* renamed from: bpe  reason: default package */
/* loaded from: classes.dex */
final class bpe implements ddv {
    final /* synthetic */ bpf a;

    public bpe(bpf bpfVar) {
        this.a = bpfVar;
    }

    @Override // defpackage.ddv
    public final void a() {
        bpf bpfVar = this.a;
        if (bpfVar.c == null || !bpfVar.g) {
            return;
        }
        bpfVar.b(bpfVar.h, bpfVar.i, bpfVar.j);
        bpf bpfVar2 = this.a;
        bpfVar2.h = null;
        bpfVar2.i = null;
        bpfVar2.j = false;
        bpfVar2.g = false;
        bpfVar2.d();
    }

    @Override // defpackage.ddv
    public final void b() {
        LatinFixedCountCandidatesHolderView latinFixedCountCandidatesHolderView = this.a.c;
        if (latinFixedCountCandidatesHolderView != null) {
            latinFixedCountCandidatesHolderView.C();
            this.a.d();
        }
    }
}
