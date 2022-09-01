package com.google.android.apps.inputmethod.libs.hmm;

import android.content.Context;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import com.google.android.inputmethod.latin.R;
import com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class AbstractHmmDecodeProcessor extends BaseDecodeProcessor implements dji, dig {
    private boolean a;
    private boolean b;
    private boolean c;
    private Iterator fc;
    private final dih fd = new dkm(this, 1);
    protected volatile djh i;
    protected boolean j;
    public boolean k;
    public boolean l;

    private final void gd() {
        gvt.a(this.i);
        this.i = null;
    }

    private final void hp(boolean z) {
        if (this.i != null) {
            this.i.t();
        }
        this.j = false;
        this.a = false;
        this.b = false;
        if (z) {
            this.fc = null;
            this.k = false;
        }
        L();
    }

    public void H(int i, int i2) {
    }

    public void K() {
    }

    protected void L() {
    }

    @Override // com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor, defpackage.hnj
    public void ad(Context context, gwv gwvVar, iav iavVar) {
        super.ad(context, gwvVar, iavVar);
        this.c = iavVar.q.d(R.id.f54910_resource_name_obfuscated_res_0x7f0b01d3, true);
    }

    @Override // defpackage.dji
    public long ae(String[] strArr) {
        return 0L;
    }

    public final idk af() {
        idk idkVar = this.s;
        return idkVar != null ? idkVar : ieh.j();
    }

    @Override // defpackage.dji
    public String ag(String str) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ah(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            aw(charSequence, 1);
        }
        al("");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    public void ai() {
        if (ao()) {
            af().e(dja.COMPOSING_ABORTED, new Object[0]);
        }
        hp(true);
        av(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void aj(String str, String str2, boolean z) {
        String[] strArr;
        int[] e;
        if (this.i != null) {
            this.i.e();
            int b = this.i.b();
            String e2 = this.i.e();
            dik dikVar = (dik) this.i;
            if (!dikVar.i) {
                strArr = gvw.g;
            } else {
                ArrayList A = lre.A();
                int e3 = dikVar.m.e();
                for (int i = 0; i < e3; i++) {
                    long k = dikVar.m.k(i);
                    if (dikVar.m.q(k).startVertexIndex >= dikVar.h) {
                        int f = dikVar.m.f(k);
                        for (int i2 = 0; i2 < f; i2++) {
                            long l = dikVar.m.l(k, i2);
                            if (dikVar.m.n(l) == djj.SOURCE_TOKEN) {
                                A.add("GESTURE");
                            } else if (dikVar.m.z(l)) {
                                A.add("TAPPING");
                            } else {
                                A.add("TAPPING_CORRECTED");
                            }
                        }
                    }
                }
                strArr = (String[]) A.toArray(new String[A.size()]);
            }
            String[] strArr2 = strArr;
            dik dikVar2 = (dik) this.i;
            if (!dikVar2.i) {
                e = gvw.b;
            } else {
                int e4 = dikVar2.m.e();
                gvy gvyVar = new gvy(e4);
                for (int i3 = 0; i3 < e4; i3++) {
                    long k2 = dikVar2.m.k(i3);
                    if (dikVar2.m.q(k2).startVertexIndex >= dikVar2.h) {
                        int f2 = dikVar2.m.f(k2);
                        for (int i4 = 0; i4 < f2; i4++) {
                            HmmEngineInterfaceImpl hmmEngineInterfaceImpl = dikVar2.m;
                            gvyVar.b(hmmEngineInterfaceImpl.i(hmmEngineInterfaceImpl.l(k2, i4)));
                        }
                    }
                }
                e = gvyVar.e();
            }
            ak(str, b, e2, str2, strArr2, e, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ak(String str, int i, String str2, String str3, String[] strArr, int[] iArr, boolean z) {
        idk af = af();
        dja djaVar = dja.TEXT_COMMITTED;
        Object[] objArr = new Object[7];
        objArr[0] = str;
        objArr[1] = Integer.valueOf(i);
        objArr[2] = str2;
        objArr[3] = str3;
        objArr[4] = strArr;
        objArr[5] = iArr;
        ifn ifnVar = this.t;
        objArr[6] = ifnVar != null ? ihm.b(ifnVar) : null;
        af.e(djaVar, objArr);
        if (z) {
            af().e(dja.CHARACTERS_INPUTTED, "GESTURE", Integer.valueOf(str3.length()));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void al(CharSequence charSequence) {
        gwv gwvVar;
        boolean z = this.j;
        boolean z2 = !TextUtils.isEmpty(charSequence);
        this.j = z2;
        if ((z2 || z) && (gwvVar = this.u) != null) {
            gwvVar.b(hnl.k(charSequence, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void am(List list) {
        gwv gwvVar;
        if (!this.b) {
            boolean z = this.a;
            boolean z2 = false;
            if (list != null && !list.isEmpty()) {
                z2 = true;
            }
            this.a = z2;
            if ((!z2 && !z) || (gwvVar = this.u) == null) {
                return;
            }
            hnl i = hnl.i(7, this);
            i.s = list;
            gwvVar.b(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void an(Iterator it) {
        if (this.b || this.fc == it) {
            return;
        }
        boolean z = this.k;
        boolean z2 = false;
        if (it != null && it.hasNext()) {
            z2 = true;
        }
        this.k = z2;
        this.fc = it;
        if (!z2 && !z) {
            return;
        }
        av(z2);
    }

    @Override // com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor, defpackage.hni
    public final boolean ao() {
        return this.i != null && ((dik) this.i).i;
    }

    @Override // com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    protected final boolean ap(int i) {
        hln hlnVar;
        ArrayList A = lre.A();
        if (this.fc != null) {
            loop0: while (true) {
                hlnVar = null;
                while (A.size() < i && this.fc.hasNext()) {
                    hln hlnVar2 = (hln) this.fc.next();
                    if (hlnVar2 != null) {
                        A.add(hlnVar2);
                        if (hlnVar2.e != hlm.APP_COMPLETION && hlnVar == null) {
                            if (hlnVar2.e != hlm.RAW) {
                                if (ao()) {
                                    boolean D = this.i.D(hlnVar2);
                                    dik dikVar = (dik) this.i;
                                    if (dikVar.e) {
                                        Object obj = hlnVar2.j;
                                        if (obj instanceof Integer) {
                                            if (dikVar.m.C(((Integer) obj).intValue()) != 8) {
                                                if (!D) {
                                                    break;
                                                }
                                            } else if (this.c) {
                                                if (!D) {
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        } else {
                                            throw new IllegalArgumentException("candidate.data is not an Integer");
                                        }
                                    } else {
                                        throw new IllegalArgumentException("mCandidateListEnabled is false");
                                    }
                                } else {
                                    continue;
                                }
                            }
                            hlnVar = hlnVar2;
                        }
                    }
                }
            }
            Iterator it = this.fc;
            if (it == null) {
                return true;
            }
            boolean hasNext = it.hasNext();
            gwv gwvVar = this.u;
            if (gwvVar == null) {
                return true;
            }
            gwvVar.b(hnl.b(A, hlnVar, hasNext, this));
            return true;
        }
        return false;
    }

    @Override // com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    protected final boolean aq(boolean z) {
        boolean z2 = false;
        if (z || !ao()) {
            this.fc = null;
            this.k = false;
            this.b = true;
            am(null);
            return false;
        }
        this.b = false;
        if (r() && this.i != null) {
            am(this.i.h());
        }
        Iterator z3 = z();
        this.fc = z3;
        if (z3 != null && z3.hasNext()) {
            z2 = true;
        }
        this.k = z2;
        av(z2);
        return true;
    }

    @Override // com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor, defpackage.hnj
    public boolean ar(hfd hfdVar) {
        iay iayVar = hfdVar.b[0];
        int i = iayVar.c;
        return iayVar.e != null || i == 67 || i == 62 || i == 66;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void as(String str, int i, boolean z) {
        am(null);
        if (z) {
            an(null);
        }
        if (!TextUtils.isEmpty(str)) {
            aw(str, i);
        }
        al("");
        hp(z);
    }

    @Override // com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    protected final void at() {
        as(null, 1, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract dij e();

    public djf f() {
        return null;
    }

    protected abstract djh g();

    public void k() {
        this.i = g();
        ((dik) this.i).l = this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    public void l(EditorInfo editorInfo, boolean z) {
        gd();
        dij e = e();
        e.B(this);
        if (e.q() != null) {
            this.fd.a();
        } else {
            e.C(this.fd);
        }
        boolean z2 = false;
        if (!z && irs.d()) {
            z2 = true;
        }
        this.l = z2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    public void m() {
        gd();
        e().D(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.libraries.inputmethod.ime.processor.BaseDecodeProcessor
    public void n() {
        gd();
        dij e = e();
        dih dihVar = this.fd;
        synchronized (e.m) {
            Iterator it = e.m.iterator();
            while (it.hasNext()) {
                dif difVar = (dif) it.next();
                if (difVar.a == dihVar) {
                    e.m.remove(difVar);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean r() {
        return false;
    }

    public String x(String str) {
        return str;
    }

    public String y(String str, String[] strArr) {
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Iterator z() {
        if (this.i == null) {
            return null;
        }
        return this.i.f();
    }
}
