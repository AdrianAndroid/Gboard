package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.inputmethod.trainingcache.impls.nebulaematerializer.NebulaeMaterializerV2;
import com.google.android.libraries.inputmethod.trainingcache.storage.StorageAdapterFactory;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: iul  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class iul implements leq {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ iul(StorageAdapterFactory storageAdapterFactory, int i) {
        this.b = i;
        this.a = storageAdapterFactory;
    }

    public /* synthetic */ iul(ium iumVar, int i) {
        this.b = i;
        this.a = iumVar;
    }

    public /* synthetic */ iul(iur iurVar, int i) {
        this.b = i;
        this.a = iurVar;
    }

    public /* synthetic */ iul(ivr ivrVar, int i) {
        this.b = i;
        this.a = ivrVar;
    }

    public /* synthetic */ iul(iwk iwkVar, int i) {
        this.b = i;
        this.a = iwkVar;
    }

    public /* synthetic */ iul(ixk ixkVar, int i) {
        this.b = i;
        this.a = ixkVar;
    }

    public /* synthetic */ iul(iyu iyuVar, int i) {
        this.b = i;
        this.a = iyuVar;
    }

    public /* synthetic */ iul(Boolean bool, int i) {
        this.b = i;
        this.a = bool;
    }

    public /* synthetic */ iul(List list, int i) {
        this.b = i;
        this.a = list;
    }

    public /* synthetic */ iul(jig jigVar, int i) {
        this.b = i;
        this.a = jigVar;
    }

    public /* synthetic */ iul(jkj jkjVar, int i) {
        this.b = i;
        this.a = jkjVar;
    }

    public /* synthetic */ iul(lfb lfbVar, int i) {
        this.b = i;
        this.a = lfbVar;
    }

    public /* synthetic */ iul(llk llkVar, int i) {
        this.b = i;
        this.a = llkVar;
    }

    public /* synthetic */ iul(llw llwVar, int i) {
        this.b = i;
        this.a = llwVar;
    }

    public /* synthetic */ iul(lmx lmxVar, int i) {
        this.b = i;
        this.a = lmxVar;
    }

    public /* synthetic */ iul(ngz ngzVar, int i) {
        this.b = i;
        this.a = ngzVar;
    }

    public /* synthetic */ iul(byte[] bArr, int i) {
        this.b = i;
        this.a = bArr;
    }

    /* JADX WARN: Type inference failed for: r0v42, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.leq
    public final Object a(Object obj) {
        File[] listFiles;
        boolean z = true;
        switch (this.b) {
            case 0:
                Context context = ((ium) this.a).a;
                hrx.y(context);
                return new iuk(context, (ixi) obj);
            case 1:
                Context context2 = ((ium) this.a).a;
                hrx.y(context2);
                return new NebulaeMaterializerV2((ixi) obj, context2, ieh.j());
            case 2:
                Object obj2 = this.a;
                String languageTag = jav.e((String) obj).q().toLanguageTag();
                String str = (String) ((iur) obj2).e.get(languageTag);
                return str == null ? languageTag : str;
            case 3:
                Object obj3 = this.a;
                mxd mxdVar = (mxd) obj;
                ltg ltgVar = ivr.a;
                nfh t = mxd.b.t();
                llg values = ((llw) obj3).values();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mxd mxdVar2 = (mxd) t.b;
                nga ngaVar = mxdVar2.a;
                if (!ngaVar.c()) {
                    mxdVar2.a = nfm.H(ngaVar);
                }
                ndt.cs(values, mxdVar2.a);
                return (mxd) t.cz();
            case 4:
                Object obj4 = this.a;
                llw d = ivr.d((mxd) obj);
                llw d2 = ivr.d((mxd) ivr.b.j());
                lsz it = lvw.i(d.keySet(), d2.keySet()).iterator();
                while (it.hasNext()) {
                    mxc mxcVar = (mxc) d.get((String) it.next());
                    if (mxcVar != null) {
                        ivr ivrVar = (ivr) obj4;
                        ivrVar.f(mxcVar);
                        jan.b.e(kki.J(ivrVar.c, mxcVar.b));
                    }
                }
                lsz it2 = d2.values().iterator();
                while (it2.hasNext()) {
                    mxc mxcVar2 = (mxc) it2.next();
                    ivr ivrVar2 = (ivr) obj4;
                    Context context3 = ivrVar2.c;
                    String str2 = mxcVar2.b;
                    mxb mxbVar = mxcVar2.d;
                    if (mxbVar == null) {
                        mxbVar = mxb.d;
                    }
                    String str3 = mxbVar.b;
                    File J = kki.J(context3, str2);
                    if (J.exists() && J.isDirectory() && (listFiles = J.listFiles()) != null) {
                        boolean z2 = false;
                        for (File file : listFiles) {
                            if (file.isDirectory() && !file.getName().equals(str3)) {
                                jan.b.e(file);
                                z2 = true;
                            }
                        }
                        if (z2) {
                            ((ltd) ((ltd) ivr.a.b()).k("com/google/android/libraries/inputmethod/trainingcache/localcomputation/LocalComputationTaskManager", "deleteObsoleteTaskWorkingDirs", 381, "LocalComputationTaskManager.java")).w("Obsolete working directories and artifacts deleted for the task %s.", mxcVar2.b);
                        }
                    }
                    if (ivrVar2.j(mxcVar2)) {
                        ivrVar2.h(mxcVar2);
                        ivrVar2.i(mxcVar2);
                        ivrVar2.g(mxcVar2);
                    } else {
                        ivrVar2.f(mxcVar2);
                    }
                }
                return d2;
            case 5:
                Object obj5 = this.a;
                Void r14 = (Void) obj;
                hyt a = hyz.a();
                a.b(false);
                hyz a2 = a.a();
                ivr ivrVar3 = (ivr) obj5;
                ivrVar3.e.e(ivr.b, iuu.f, "nebulae-lc-artifacts", a2, a2, null, new ehz(ivrVar3, 17));
                return null;
            case 6:
                iwk iwkVar = (iwk) this.a;
                iwkVar.f = false;
                iwkVar.e = (ixe) obj;
                iwkVar.g.a(iwkVar.d);
                return null;
            case 7:
                Object obj6 = this.a;
                ixc ixcVar = (ixc) obj;
                String str4 = ixcVar.a;
                jzi jziVar = new jzi(null);
                jziVar.c = "trainingcachev3.db";
                ngf ngfVar = ngf.LONG;
                if (jziVar.g == null) {
                    jziVar.g = llw.h();
                }
                ((lls) jziVar.g).a("_session_id", ngfVar);
                jziVar.a("_timestamp_");
                jziVar.a("_session_id");
                llp llpVar = ixcVar.b;
                int i = ((lrl) llpVar).c;
                for (int i2 = 0; i2 < i; i2++) {
                    ipq ipqVar = (ipq) llpVar.get(i2);
                    if (jziVar.e == null) {
                        jziVar.e = llp.e();
                    }
                    ((llk) jziVar.e).h(ipqVar);
                }
                StorageAdapterFactory storageAdapterFactory = (StorageAdapterFactory) obj6;
                Context context4 = storageAdapterFactory.c;
                Object obj7 = jziVar.e;
                if (obj7 != null) {
                    jziVar.b = ((llk) obj7).g();
                } else if (jziVar.b == null) {
                    jziVar.b = llp.q();
                }
                Object obj8 = jziVar.g;
                if (obj8 != null) {
                    jziVar.d = ((lls) obj8).l();
                } else if (jziVar.d == null) {
                    jziVar.d = lrq.b;
                }
                Object obj9 = jziVar.a;
                if (obj9 != null) {
                    jziVar.f = ((lmx) obj9).g();
                } else if (jziVar.f == null) {
                    jziVar.f = lrr.a;
                }
                Object obj10 = jziVar.c;
                if (obj10 == null) {
                    throw new IllegalStateException("Missing required properties: name");
                }
                ipk a3 = ipo.a(context4, new ipa((String) obj10, (llp) jziVar.b, (llw) jziVar.d, (lmz) jziVar.f));
                if (a3 == null) {
                    throw new IllegalArgumentException("Failed to get ProtoXDB instance.");
                }
                iwt iwtVar = new iwt(a3, storageAdapterFactory.b);
                iwq iwqVar = new iwq(iwtVar, storageAdapterFactory.b);
                if (iwqVar.f == null) {
                    iwqVar.f = new iwo(iwqVar);
                }
                iwqVar.f.f(iwqVar.c);
                if (iwqVar.e == null) {
                    iwqVar.e = new iwp(iwqVar);
                }
                iwqVar.e.d(iwqVar.c);
                return new jls(iwtVar, iwqVar);
            case 8:
                List list = (List) obj;
                ((ixk) this.a).c.k("pref_scheduled_trainer_session_names", null);
                return null;
            case 9:
                Object obj11 = this.a;
                ngz ngzVar = (ngz) obj;
                if (ngzVar != null) {
                    ((iyu) obj11).b = ngzVar;
                }
                return ((iyu) obj11).b;
            case 10:
                byte[] bArr = (byte[]) obj;
                return this.a;
            case 11:
                ngz ngzVar2 = (ngz) obj;
                return this.a;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                byte[] bArr2 = (byte[]) obj;
                return this.a;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                Object obj12 = this.a;
                jho jhoVar = (jho) obj;
                if (jhoVar != null) {
                    ((llk) obj12).h(jhoVar);
                }
                return obj12;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ?? r0 = this.a;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    r0.add(uri);
                }
                return null;
            case 15:
                this.a.addAll((List) obj);
                return null;
            case 16:
                Object obj13 = this.a;
                ((Boolean) obj).booleanValue();
                return obj13;
            case 17:
                Void r142 = (Void) obj;
                return this.a;
            case 18:
                Object obj14 = this.a;
                for (jlq jlqVar : (List) obj) {
                    jig jigVar = jlqVar.b;
                    for (jie jieVar : jigVar.m) {
                        int h = ker.h(jigVar.h);
                        if (h == 0) {
                            h = 1;
                        }
                        ((lmx) obj14).d(kki.t(jieVar, h));
                    }
                }
                return ((lmx) obj14).g();
            case 19:
                jmk.g((IOException) obj, "%s: Detected corruption of isolated structure for group %s", "FileGroupManager", ((jig) this.a).c);
                return false;
            default:
                Object obj15 = this.a;
                if (!((Boolean) obj).booleanValue() || !((Boolean) obj15).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
