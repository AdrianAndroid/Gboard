package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: dxw  reason: default package */
/* loaded from: classes.dex */
public final class dxw implements idm {
    public static final /* synthetic */ int e = 0;
    private static final int[] f = {R.string.f161250_resource_name_obfuscated_res_0x7f14069d};
    private static final int[] g = {R.string.f161370_resource_name_obfuscated_res_0x7f1406a9, R.string.f161270_resource_name_obfuscated_res_0x7f14069f, R.string.f161350_resource_name_obfuscated_res_0x7f1406a7, R.string.f161260_resource_name_obfuscated_res_0x7f14069e, R.string.f161280_resource_name_obfuscated_res_0x7f1406a0, R.string.f161310_resource_name_obfuscated_res_0x7f1406a3, R.string.f161330_resource_name_obfuscated_res_0x7f1406a5, R.string.f161290_resource_name_obfuscated_res_0x7f1406a1, R.string.f161340_resource_name_obfuscated_res_0x7f1406a6, R.string.f161320_resource_name_obfuscated_res_0x7f1406a4, R.string.f161300_resource_name_obfuscated_res_0x7f1406a2, R.string.f161360_resource_name_obfuscated_res_0x7f1406a8};
    private static final int[] h = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048};
    public final idi a;
    public final nfh c;
    private final Context i;
    private final ino j;
    public final Set b = new HashSet();
    public final idb d = new dxx(this);

    public dxw(Context context, idi idiVar, ino inoVar, nfh nfhVar) {
        this.i = context;
        this.a = idiVar;
        this.j = inoVar;
        this.c = nfhVar;
    }

    public final void a() {
        nfh nfhVar = this.c;
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mcc mccVar = (mcc) nfhVar.b;
        mcc mccVar2 = mcc.aB;
        mccVar.b |= 65536;
        mccVar.L = 0;
        if (this.j.aj(R.string.f161250_resource_name_obfuscated_res_0x7f14069d)) {
            for (int i = 0; i < 12; i++) {
                if (this.j.aj(g[i])) {
                    nfh nfhVar2 = this.c;
                    int i2 = ((mcc) nfhVar2.b).L | h[i];
                    if (nfhVar2.c) {
                        nfhVar2.cD();
                        nfhVar2.c = false;
                    }
                    mcc mccVar3 = (mcc) nfhVar2.b;
                    mccVar3.b |= 65536;
                    mccVar3.L = i2;
                }
            }
        }
    }

    @Override // defpackage.idj
    public final void e() {
        this.b.add(this.i.getString(f[0]));
        int[] iArr = g;
        for (int i = 0; i < 12; i++) {
            this.b.add(this.i.getString(iArr[i]));
        }
        a();
    }

    @Override // defpackage.idj
    public final void f() {
        this.a.a();
    }

    @Override // defpackage.idm
    public final void p(ido idoVar, idu iduVar, long j, long j2, Object... objArr) {
        this.d.b(idoVar, iduVar, j, j2, objArr);
    }

    @Override // defpackage.idm
    public final /* synthetic */ void r(idl idlVar) {
    }

    @Override // defpackage.idj
    public final /* synthetic */ boolean s() {
        return true;
    }

    @Override // defpackage.idm
    public final ido[] t() {
        return dxx.a;
    }
}
