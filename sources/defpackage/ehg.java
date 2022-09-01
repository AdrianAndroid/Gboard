package defpackage;

/* compiled from: PG */
/* renamed from: ehg  reason: default package */
/* loaded from: classes.dex */
public final class ehg {
    static final hhl a = hhq.f("max_feature_header_pack_impressions", 0);
    static final hhl b = hhq.a("enable_show_browse_tab_default_once", false);
    static final hhl c = hhq.f("min_cooldown_rejected_feature_header_pack_millis", 0);
    static final hhl d = hhq.f("min_cooldown_added_feature_header_pack_millis", 0);
    public final ino e;

    public ehg(ino inoVar) {
        this.e = inoVar;
    }

    public final int a() {
        return this.e.D("pref_key_feature_pack_shown_count_key");
    }

    public final void b() {
        this.e.f("pref_key_has_defaulted_to_browse_once_key", true);
    }

    public final void c(int i) {
        this.e.h("pref_key_feature_pack_shown_count_key", i);
    }

    public final void d(String str, boolean z) {
        this.e.j("pref_key_last_interacted_feature_pack_id_key", str);
        this.e.h("pref_key_feature_pack_shown_count_key", 0);
        this.e.i(true != z ? "pref_key_header_feature_pack_last_rejected_time_millis_key" : "pref_key_header_feature_pack_last_added_time_millis_key", System.currentTimeMillis());
    }

    public final boolean e(cxc cxcVar) {
        String str = cxcVar.b;
        if (!str.equals(this.e.Q("pref_key_last_feature_pack_id_key"))) {
            c(1);
            this.e.j("pref_key_last_feature_pack_id_key", str);
            return false;
        }
        int a2 = a() + 1;
        c(a2);
        hhl hhlVar = a;
        if (((Long) hhlVar.c()).longValue() <= 0 || a2 < ((Long) hhlVar.c()).longValue()) {
            return false;
        }
        ieh.j().e(ctf.FEATURED_PACK_INTERACTION, cth.HEADER_PACK_MAXIMUM_IMPRESSIONS);
        d(str, false);
        return true;
    }

    public final boolean f() {
        return ((Boolean) b.c()).booleanValue() && !this.e.ak("pref_key_has_defaulted_to_browse_once_key");
    }

    public final boolean g(lfb lfbVar) {
        if (lfbVar.e() && !((String) lfbVar.a()).equals(this.e.Q("pref_key_last_interacted_feature_pack_id_key"))) {
            hhl hhlVar = a;
            if (((Long) hhlVar.c()).longValue() > 0 && a() >= ((Long) hhlVar.c()).longValue()) {
                return false;
            }
            hhl hhlVar2 = c;
            if (((Long) hhlVar2.c()).longValue() > 0 && this.e.I("pref_key_header_feature_pack_last_rejected_time_millis_key") + ((Long) hhlVar2.c()).longValue() > System.currentTimeMillis()) {
                return false;
            }
            hhl hhlVar3 = d;
            return ((Long) hhlVar3.c()).longValue() <= 0 || this.e.I("pref_key_header_feature_pack_last_added_time_millis_key") + ((Long) hhlVar3.c()).longValue() <= System.currentTimeMillis();
        }
        return false;
    }
}
