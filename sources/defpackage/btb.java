package defpackage;

import android.content.Context;
import com.google.android.apps.inputmethod.libs.hmm.HmmEngineInterfaceImpl;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: btb  reason: default package */
/* loaded from: classes.dex */
public class btb extends btt {
    private static final String[] a = {"zh-hant-t-i0-cangjie-1987-nacl"};
    private static final llw b = llw.m("cangjie_standard_standard", llw.m("cangjie_version_5", "v5_prefix_setting_scheme", "cangjie_version_3", "v3_prefix_setting_scheme"), "cangjie_standard_express", llw.m("cangjie_version_5", "v5_easy_setting_scheme", "cangjie_version_3", "v3_easy_setting_scheme"));
    private final String[] c = new String[1];
    private String d;
    private String o;

    /* JADX INFO: Access modifiers changed from: protected */
    public btb(Context context) {
        super(context);
    }

    protected int a() {
        return R.string.f160440_resource_name_obfuscated_res_0x7f140649;
    }

    @Override // defpackage.dij
    protected final String b() {
        return "cangjie_data_scheme";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dij
    public final void c() {
        super.c();
        this.d = this.h.y(R.string.f160430_resource_name_obfuscated_res_0x7f140648);
        this.o = this.h.y(a());
    }

    @Override // defpackage.dij
    protected final String[] d() {
        return a;
    }

    @Override // defpackage.dij
    protected final String[] e() {
        this.c[0] = (String) ((llw) b.get(this.d)).get(this.o);
        return this.c;
    }

    public final HmmEngineInterfaceImpl f() {
        this.d = this.h.y(R.string.f160430_resource_name_obfuscated_res_0x7f140648);
        this.o = this.h.y(a());
        E();
        return super.K("zh-hant-t-i0-cangjie-1987-nacl");
    }
}
