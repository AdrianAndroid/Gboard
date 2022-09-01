package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: cgp  reason: default package */
/* loaded from: classes.dex */
public final class cgp extends dij {
    private static final String[] a = new String[0];
    private static final String[] b = new String[0];
    private static final String[] c = {null, "en_contacts_dictionary_accessor", "en_user_dictionary_accessor", "en_shortcut_dictionary_accessor"};
    private static final String[] d = {null, "contacts_dict_3_3_english", "user_dict_3_3_english", "shortcuts_dict_3_3_english"};
    private static final String[] e = {null, "", "", ""};
    private static final String[] o = {null, "en_mutable_dictionary_accessor_setting_scheme", "en_mutable_dictionary_accessor_setting_scheme", "shortcuts_mutable_dictionary_accessor_setting_scheme"};

    public cgp(Context context, String str) {
        super(context);
        div.c().i(this, "en", str);
    }

    @Override // defpackage.dij
    protected final String b() {
        return "en_data_scheme";
    }

    @Override // defpackage.dij
    protected final String[] d() {
        return a;
    }

    @Override // defpackage.dij
    protected final String[] e() {
        return b;
    }

    @Override // defpackage.dij
    public final String g() {
        return "en-t-i0-und";
    }

    @Override // defpackage.dij
    protected final void gf() {
        c();
        s();
        t();
        v();
    }

    @Override // defpackage.dij
    protected final String[] i() {
        return c;
    }

    @Override // defpackage.dij
    protected final String[] j() {
        return o;
    }

    @Override // defpackage.dij
    protected final String[] k() {
        return !irs.d() ? e : d;
    }

    public final void l() {
        gyk.i(this.k).s(new cgq(this));
        ikj.C(this.k).s(new djq(this, new cgo(0)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dij
    public final void o(int i, nfh nfhVar) {
    }
}
