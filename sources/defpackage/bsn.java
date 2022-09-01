package defpackage;

import android.content.Context;
import android.util.Printer;
import android.util.SparseArray;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: bsn  reason: default package */
/* loaded from: classes.dex */
public final class bsn implements ifw {
    public int b;
    public EditorInfo c;
    public boolean d;
    private final String e;
    private final Context g;
    private final SparseArray f = new SparseArray();
    private final jcb h = new bsl(this);
    private final hst i = new bsm(this);
    private final hwu j = new bsq(this, 1);
    private final ija k = ijf.c(new bqj(this, 8), new bqj(this, 8), irs.a);
    public final hso a = new hso();

    public bsn(Context context) {
        this.g = context;
        this.e = context.getString(R.string.f154020_resource_name_obfuscated_res_0x7f140337);
    }

    private final gqe e() {
        gqe a = gqh.a();
        a.i(this.e);
        a.b("default", true);
        return a;
    }

    private static boolean f(int i, int i2) {
        return (i & i2) == i2;
    }

    public final void c() {
        int i;
        EditorInfo editorInfo = this.c;
        if (editorInfo == null) {
            return;
        }
        int i2 = this.b & (-16);
        boolean z = this.d;
        if (lre.aI(this.g, editorInfo)) {
            i = 4;
        } else if (lre.aH(this.g, editorInfo, z)) {
            i = 2;
        } else {
            i = lre.aG(this.g, editorInfo) ? 8 : 1;
        }
        d(i | i2);
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        this.b = 0;
        mjl mjlVar = mjl.a;
        this.k.d(mjlVar);
        this.h.d(mjlVar);
        this.i.g(mjlVar);
        this.a.V().a(ice.HEADER, this.j);
    }

    @Override // defpackage.ifw
    public final void gn() {
        grd.b(R.id.key_pos_header_power_key, this.e);
        hso hsoVar = this.a;
        hfd b = hfd.b();
        b.j(new iay(-10026, null, 49152L));
        hsoVar.at(b);
        this.k.f();
        this.h.e();
        this.i.h();
        this.a.V().l(ice.HEADER, this.j);
    }

    public final void d(int i) {
        gqh gqhVar;
        if (this.b == i) {
            return;
        }
        this.b = i;
        gqh gqhVar2 = null;
        if (!f(i, 8)) {
            if (f(i, 16)) {
                gqhVar2 = (gqh) this.f.get(16);
                if (gqhVar2 == null) {
                    gqe e = e();
                    lre.aJ(e);
                    e.f(R.attr.f4200_resource_name_obfuscated_res_0x7f0400d4);
                    e.d(R.string.f148250_resource_name_obfuscated_res_0x7f14006b);
                    e.b("layout", Integer.valueOf((int) R.layout.f145520_resource_name_obfuscated_res_0x7f0e0552));
                    gqhVar2 = e.a();
                    this.f.put(16, gqhVar2);
                }
            } else if (f(i, 1)) {
                gqhVar2 = (gqh) this.f.get(1);
                if (gqhVar2 == null) {
                    gqe e2 = e();
                    lre.aJ(e2);
                    e2.f(R.attr.f4200_resource_name_obfuscated_res_0x7f0400d4);
                    e2.d(R.string.f188060_resource_name_obfuscated_res_0x7f14119b);
                    e2.b("layout", Integer.valueOf((int) R.layout.f145470_resource_name_obfuscated_res_0x7f0e054d));
                    gqhVar2 = e2.a();
                    this.f.put(1, gqhVar2);
                }
            } else if (f(i, 4)) {
                gqhVar = (gqh) this.f.get(4);
                if (gqhVar == null) {
                    gqe e3 = e();
                    e3.f(R.drawable.f50430_resource_name_obfuscated_res_0x7f080352);
                    e3.d(R.string.f188050_resource_name_obfuscated_res_0x7f14119a);
                    e3.k(-10042, null);
                    e3.b("layout", Integer.valueOf((int) R.layout.f145470_resource_name_obfuscated_res_0x7f0e054d));
                    gqhVar2 = e3.a();
                    this.f.put(4, gqhVar2);
                }
                gqhVar2 = gqhVar;
            } else if (f(i, 2)) {
                gqhVar = (gqh) this.f.get(2);
                if (gqhVar == null) {
                    gqe e4 = e();
                    e4.f(R.attr.f4100_resource_name_obfuscated_res_0x7f0400ca);
                    e4.d(R.string.f188050_resource_name_obfuscated_res_0x7f14119a);
                    e4.k(-10108, null);
                    e4.b("layout", Integer.valueOf((int) R.layout.f145470_resource_name_obfuscated_res_0x7f0e054d));
                    gqhVar2 = e4.a();
                    this.f.put(2, gqhVar2);
                }
                gqhVar2 = gqhVar;
            }
        }
        if (gqhVar2 != null) {
            gqq.b(R.id.key_pos_header_power_key, gqhVar2);
        } else {
            grd.b(R.id.key_pos_header_power_key, this.e);
        }
    }
}
