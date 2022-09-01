package defpackage;

import com.google.android.apps.inputmethod.libs.hmm.SettingManagerImpl;
import com.google.android.apps.inputmethod.libs.hmmgesture.HmmGestureDecoder;

/* compiled from: PG */
/* renamed from: dkl  reason: default package */
/* loaded from: classes.dex */
public abstract class dkl implements inm, diu {
    private static final lug c = hin.a;
    protected final dij b;
    private boolean d = false;
    protected final ino a = ino.L();

    /* JADX INFO: Access modifiers changed from: protected */
    public dkl(dij dijVar) {
        this.b = dijVar;
    }

    private final void h() {
        if (!a().d(d(), this.b.J())) {
            ((luc) ((luc) c.c()).k("com/google/android/apps/inputmethod/libs/hmmgesture/AbstractHmmGestureDecoderFactory", "enrollDataScheme", 105, "AbstractHmmGestureDecoderFactory.java")).w("Enroll data scheme failed %s.", d());
        }
    }

    private final void i() {
        String[] f;
        mpo b;
        SettingManagerImpl settingManagerImpl = this.b.n;
        for (String str : f()) {
            if (!str.isEmpty() && (b = a().b(str)) != null) {
                nfh nfhVar = (nfh) b.N(5);
                nfhVar.cG(b);
                g(b.b, nfhVar);
                mpo mpoVar = (mpo) nfhVar.cz();
                settingManagerImpl.a(mpoVar.b, mpoVar.q());
            }
        }
    }

    public final djm a() {
        return div.c().d(this);
    }

    public final HmmGestureDecoder c(String str) {
        if (!this.d) {
            this.a.W(this);
            this.d = true;
        }
        if (div.c().l(this)) {
            if (a() != null) {
                a().e(d(), this.b.J());
            }
            h();
            i();
        }
        dij dijVar = this.b;
        long b = HmmGestureDecoder.b(dijVar.n.a, dijVar.J().a, str);
        if (b != 0) {
            return new HmmGestureDecoder(b);
        }
        return null;
    }

    protected abstract String d();

    protected boolean e(String str) {
        return false;
    }

    protected abstract String[] f();

    protected void g(String str, nfh nfhVar) {
    }

    @Override // defpackage.inm
    public final void go(ino inoVar, String str) {
        if (e(str)) {
            i();
        }
    }

    @Override // defpackage.diu
    public final void z() {
        h();
        i();
    }
}
