package defpackage;

import android.content.SharedPreferences;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: jke  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jke implements miy {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jke(jig jigVar, int i) {
        this.b = i;
        this.a = jigVar;
    }

    public /* synthetic */ jke(jiq jiqVar, int i) {
        this.b = i;
        this.a = jiqVar;
    }

    public /* synthetic */ jke(jkk jkkVar, int i) {
        this.b = i;
        this.a = jkkVar;
    }

    public /* synthetic */ jke(jkm jkmVar, int i) {
        this.b = i;
        this.a = jkmVar;
    }

    public /* synthetic */ jke(jkp jkpVar, int i) {
        this.b = i;
        this.a = jkpVar;
    }

    public /* synthetic */ jke(jkv jkvVar, int i) {
        this.b = i;
        this.a = jkvVar;
    }

    public /* synthetic */ jke(mko mkoVar, int i) {
        this.b = i;
        this.a = mkoVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v86, types: [jml, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Object, jhy] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, jkl] */
    @Override // defpackage.miy
    public final mko a(Object obj) {
        Object obj2 = null;
        boolean z = false;
        switch (this.b) {
            case 0:
                Void r10 = (Void) obj;
                String str = ((jig) this.a).c;
                return mkk.a;
            case 1:
                Object obj3 = this.a;
                jig jigVar = (jig) obj;
                if (jigVar != null) {
                    z = jkk.q((jig) obj3, jigVar);
                }
                return kcu.K(Boolean.valueOf(z));
            case 2:
                Void r102 = (Void) obj;
                jig jigVar2 = (jig) kcu.S(this.a);
                if (jigVar2 == null) {
                    return mkk.a;
                }
                llp.r(jigVar2);
                return mkk.a;
            case 3:
                Object obj4 = this.a;
                jlq jlqVar = (jlq) obj;
                jiq jiqVar = jlqVar.a;
                jig jigVar3 = jlqVar.b;
                if (!jiqVar.e || !lre.aD(jigVar3)) {
                    return mkk.a;
                }
                jkk jkkVar = (jkk) obj4;
                return jkkVar.m(jkkVar.j(jigVar3, true), new jki(jkkVar, jigVar3, 2));
            case 4:
                Object obj5 = this.a;
                if (true == ((Boolean) obj).booleanValue()) {
                    obj2 = obj5;
                }
                return kcu.K(obj2);
            case 5:
                Object obj6 = this.a;
                if (!((Boolean) obj).booleanValue()) {
                    jiq jiqVar2 = (jiq) obj6;
                    jmk.d("%s: Failed to remove pending version for group: '%s'; account: '%s'", "FileGroupManager", jiqVar2.b, jiqVar2.d);
                    return kcu.J(new IOException("Failed to remove pending group: ".concat(String.valueOf(jiqVar2.b))));
                }
                nzv a = jhv.a();
                a.a = jhu.CUSTOM_FILEGROUP_VALIDATION_FAILED;
                a.b = jhu.CUSTOM_FILEGROUP_VALIDATION_FAILED.name();
                return kcu.J(a.e());
            case 6:
                Object obj7 = this.a;
                lfb lfbVar = (lfb) obj;
                if (!lfbVar.e()) {
                    return mkk.a;
                }
                jkk jkkVar2 = (jkk) obj7;
                return jkkVar2.m(jkkVar2.b.a((jig) lfbVar.a()), new cex(13));
            case 7:
                Object obj8 = this.a;
                ArrayList arrayList = new ArrayList();
                for (jiq jiqVar3 : (List) obj) {
                    jkk jkkVar3 = (jkk) obj8;
                    if (!jkkVar3.s(jiqVar3.c)) {
                        arrayList.add(jkkVar3.m(jkkVar3.b.g(jiqVar3), new hzb(jkkVar3, jiqVar3, 12)));
                    }
                }
                return jez.p(arrayList).a(hcb.i, ((jkk) obj8).e);
            case 8:
                Object obj9 = this.a;
                ArrayList arrayList2 = new ArrayList();
                for (jiq jiqVar4 : (List) obj) {
                    if (!jiqVar4.e) {
                        jkk jkkVar4 = (jkk) obj9;
                        arrayList2.add(jkkVar4.m(jkkVar4.b.g(jiqVar4), new ivo(jkkVar4, 20)));
                    }
                }
                return jez.p(arrayList2).a(hcb.k, ((jkk) obj9).e);
            case 9:
                jkm jkmVar = (jkm) this.a;
                return jco.j(jkmVar.n(jkmVar.a.b()), new jki(jkmVar, (jmp) obj, 9), jkmVar.b);
            case 10:
                jkm jkmVar2 = (jkm) this.a;
                return jco.j(jkmVar2.n(jkmVar2.a.e()), new jki(jkmVar2, (jmp) obj, 4), jkmVar2.b);
            case 11:
                jkm jkmVar3 = (jkm) this.a;
                return jco.j(jkmVar3.n(jkmVar3.a.k()), new jki(jkmVar3, (jmp) obj, 6), jkmVar3.b);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                jkp jkpVar = (jkp) this.a;
                return jco.j(jkpVar.b(jkpVar.b.a()), new jko(jkpVar, (jmp) obj, 6), jkpVar.c);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                jkp jkpVar2 = (jkp) this.a;
                return jco.j(jkpVar2.a.c(), new jko(jkpVar2, (Boolean) obj, 4), jkpVar2.c);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Void r103 = (Void) obj;
                jkv jkvVar = (jkv) this.a;
                SharedPreferences q = jez.q(jkvVar.b, "gms_icing_mdd_manager_metadata", jkvVar.g);
                if (q.getBoolean("mdd_migrated_to_offroad", false)) {
                    return mkk.a;
                }
                int i = jmk.a;
                return jco.i(jkvVar.a(), new jks(q, 2), jkvVar.h);
            case 15:
                Void r104 = (Void) obj;
                return ((jkv) this.a).d.b();
            case 16:
                Void r105 = (Void) obj;
                jkv jkvVar2 = (jkv) this.a;
                jli jliVar = jkvVar2.e;
                SharedPreferences q2 = jez.q(jliVar.a, "gms_icing_mdd_shared_file_manager_metadata", jliVar.h);
                if (q2.contains("migrated_to_new_file_key")) {
                    if (q2.getBoolean("migrated_to_new_file_key", false)) {
                        kki.w(jliVar.a);
                    }
                    q2.edit().remove("migrated_to_new_file_key").commit();
                }
                return jco.j(kcu.K(true), new jku(jkvVar2, 4), jkvVar2.h);
            case 17:
                Void r106 = (Void) obj;
                return ((jkv) this.a).d.c();
            case 18:
                Void r107 = (Void) obj;
                jkv jkvVar3 = (jkv) this.a;
                jkvVar3.j.i();
                return jnd.c(jkvVar3.k.a()).a(IOException.class, jkc.f, mjl.a).e(jkc.g, mjl.a);
            case 19:
                Object obj10 = this.a;
                Integer num = (Integer) obj;
                ArrayList arrayList3 = new ArrayList();
                int i2 = jmk.a;
                jkv jkvVar4 = (jkv) obj10;
                arrayList3.add(jco.j(jkvVar4.c(), new jku(jkvVar4, 6), jkvVar4.h));
                jkvVar4.j.q();
                jkk jkkVar5 = jkvVar4.c;
                arrayList3.add(jkkVar5.h(new ivo(jkkVar5, 14)));
                jkvVar4.j.t();
                jkk jkkVar6 = jkvVar4.c;
                arrayList3.add(jkkVar6.m(jkkVar6.b.d(), new jke(jkkVar6, 7)));
                jkvVar4.j.s();
                jkvVar4.j.k();
                jkk jkkVar7 = jkvVar4.c;
                arrayList3.add(jkkVar7.h(new jke(jkkVar7, 3)));
                jkvVar4.j.v();
                jmi jmiVar = jkvVar4.l;
                arrayList3.add(jco.j(jco.j(jmiVar.f.e(), new ivo(jmiVar, 8, null), jmiVar.b), new ivo(jmiVar, 10, null), jmiVar.b));
                num.intValue();
                arrayList3.add(mkk.a);
                num.intValue();
                arrayList3.add(mkk.a);
                jma jmaVar = jkvVar4.m;
                jmaVar.b.r();
                jmaVar.a.c();
                arrayList3.add(mkk.a);
                if (jkvVar4.i.e()) {
                    jkk jkkVar8 = jkvVar4.c;
                    arrayList3.add(jkkVar8.m(jkkVar8.b.d(), new jke(jkkVar8, 8)));
                }
                jez.q(jkvVar4.b, "gms_icing_mdd_manager_metadata", jkvVar4.g).edit().remove("gms_icing_mdd_manager_ph_config_version").remove("gms_icing_mdd_manager_ph_config_version_timestamp").commit();
                return jez.p(arrayList3).a(hcb.n, jkvVar4.h);
            default:
                Void r108 = (Void) obj;
                jkv jkvVar5 = (jkv) this.a;
                return jco.j(jkvVar5.f.d(), new jku(jkvVar5, 5), jkvVar5.h);
        }
    }
}
