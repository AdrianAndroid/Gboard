package defpackage;

import com.google.android.apps.inputmethod.libs.hmm.AbstractHmmDecodeProcessor;
import com.google.android.apps.inputmethod.libs.hmmhandwriting.HmmHandwritingIme;

/* compiled from: PG */
/* renamed from: dkm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dkm implements dih {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ dkm(AbstractHmmDecodeProcessor abstractHmmDecodeProcessor, int i) {
        this.b = i;
        this.a = abstractHmmDecodeProcessor;
    }

    public /* synthetic */ dkm(HmmHandwritingIme hmmHandwritingIme, int i) {
        this.b = i;
        this.a = hmmHandwritingIme;
    }

    @Override // defpackage.dih
    public final void a() {
        if (this.b == 0) {
            HmmHandwritingIme hmmHandwritingIme = (HmmHandwritingIme) this.a;
            hmmHandwritingIme.b.execute(new dgd(hmmHandwritingIme, 5));
            return;
        }
        ((AbstractHmmDecodeProcessor) this.a).k();
    }
}
