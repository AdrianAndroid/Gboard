package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: eap  reason: default package */
/* loaded from: classes.dex */
public final class eap implements hdi {
    private final cpu a = cqh.a().b;
    private final String b;
    private final /* synthetic */ int c;
    private final dxe d;

    public eap(Context context, int i, byte[] bArr) {
        this.c = i;
        this.b = context.getString(R.string.f148570_resource_name_obfuscated_res_0x7f1400b6);
        this.d = new dxe(context, (byte[]) null);
    }

    @Override // defpackage.hdj
    public final String c() {
        return this.c != 0 ? this.b : this.b;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.hdi
    public final void e(String str) {
    }

    @Override // defpackage.hdi
    public final hiz a() {
        if (this.c != 0) {
            cpu cpuVar = this.a;
            if (!irs.d()) {
                return hiz.n(llp.q());
            }
            iqx iqxVar = cpuVar.b;
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList();
            sb.append("SELECT emoji, SUM(shares) as total_shares, MAX(last_event_millis) as last_shared_timestamp FROM emoji_shares GROUP BY emoji ORDER BY total_shares DESC, last_shared_timestamp DESC LIMIT ?");
            arrayList.add(100L);
            return iqxVar.b(kws.m(sb, arrayList), cps.c, cpuVar.b.b);
        }
        return this.a.b(100L);
    }

    @Override // defpackage.hdj
    public final /* synthetic */ hiz b() {
        return this.c != 0 ? hyq.n(this) : hyq.n(this);
    }

    @Override // defpackage.hdj
    public final /* synthetic */ void d(hel helVar) {
        if (this.c != 0) {
            hyq.o(this, helVar);
        } else {
            hyq.o(this, helVar);
        }
    }

    @Override // defpackage.hdj
    public final void f() {
        if (this.c != 0) {
            this.d.i(2);
        } else {
            this.d.i(1);
        }
    }

    public eap(Context context, int i) {
        this.c = i;
        this.b = context.getString(R.string.f150750_resource_name_obfuscated_res_0x7f1401c1);
        this.d = new dxe(context, (byte[]) null);
    }
}
