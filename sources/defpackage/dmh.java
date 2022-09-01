package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.hmm.HmmEngineInterfaceImpl;

/* compiled from: PG */
/* renamed from: dmh  reason: default package */
/* loaded from: classes.dex */
public final class dmh extends dij {
    private static final String[] b = {"ko-t-i0-und"};
    private static final String[] c = {"setting_scheme"};
    private static final String[] d = {null, "contacts_dict_4_0", "user_dict_4_0", "shortcuts_dict_4_0"};
    private static final String[] e = {null, "", "", ""};
    private static final String[] o = {null, "mutable_dictionary_accessor_setting_scheme", "mutable_dictionary_accessor_setting_scheme", "mutable_dictionary_accessor_setting_scheme"};
    private static final String[] p = {"ko-t-i0-und_new_words_dictionary_accessor", "ko-t-i0-und_contacts_dictionary_accessor", "ko-t-i0-und_user_dictionary_accessor", "ko-t-i0-und_shortcuts_dictionary_accessor"};
    private static dmh q;
    public boolean a;

    private dmh(Context context) {
        super(context);
    }

    public static dmh l(Context context) {
        dmh dmhVar;
        synchronized (dmh.class) {
            if (q == null) {
                q = new dmh(context);
                div.c().i(q, "ko", "ko");
            }
            dmhVar = q;
        }
        return dmhVar;
    }

    @Override // defpackage.dij
    public final int G(int i) {
        return 0;
    }

    @Override // defpackage.dij
    protected final String[] d() {
        return b;
    }

    @Override // defpackage.dij
    protected final String[] e() {
        return c;
    }

    @Override // defpackage.dij
    public final String g() {
        return "ko-t-i0-und";
    }

    @Override // defpackage.dij
    protected final void h() {
        w();
        gyk.i(this.k).s(new dil(this));
        ikj.C(this.k).s(new djq(this, new cgo(2)));
    }

    @Override // defpackage.dij
    protected final String[] i() {
        return p;
    }

    @Override // defpackage.dij
    protected final String[] j() {
        return o;
    }

    @Override // defpackage.dij
    protected final String[] k() {
        return !irs.d() ? e : d;
    }

    public final HmmEngineInterfaceImpl m() {
        return super.K("ko-t-i0-und");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dij
    public final void o(int i, nfh nfhVar) {
        super.o(i, nfhVar);
        mpl mplVar = ((mpo) nfhVar.b).g;
        if (mplVar == null) {
            mplVar = mpl.c;
        }
        nfh nfhVar2 = (nfh) mplVar.N(5);
        nfhVar2.cG(mplVar);
        int i2 = 1;
        if (true == this.a) {
            i2 = 2;
        }
        if (nfhVar2.c) {
            nfhVar2.cD();
            nfhVar2.c = false;
        }
        mpl mplVar2 = (mpl) nfhVar2.b;
        mplVar2.b = i2 - 1;
        mplVar2.a |= 4;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mpo mpoVar = (mpo) nfhVar.b;
        mpl mplVar3 = (mpl) nfhVar2.cz();
        mplVar3.getClass();
        mpoVar.g = mplVar3;
        mpoVar.a |= 512;
    }
}
