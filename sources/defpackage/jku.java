package defpackage;

import android.content.SharedPreferences;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* renamed from: jku  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jku implements miy {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jku(jhv jhvVar, int i) {
        this.b = i;
        this.a = jhvVar;
    }

    public /* synthetic */ jku(jit jitVar, int i) {
        this.b = i;
        this.a = jitVar;
    }

    public /* synthetic */ jku(jkv jkvVar, int i) {
        this.b = i;
        this.a = jkvVar;
    }

    public /* synthetic */ jku(jkw jkwVar, int i) {
        this.b = i;
        this.a = jkwVar;
    }

    public /* synthetic */ jku(jli jliVar, int i) {
        this.b = i;
        this.a = jliVar;
    }

    public /* synthetic */ jku(jll jllVar, int i) {
        this.b = i;
        this.a = jllVar;
    }

    public /* synthetic */ jku(jqm jqmVar, int i) {
        this.b = i;
        this.a = jqmVar;
    }

    @Override // defpackage.miy
    public final mko a(Object obj) {
        switch (this.b) {
            case 0:
                Void r10 = (Void) obj;
                return ((jkv) this.a).d.b();
            case 1:
                Void r102 = (Void) obj;
                jkv jkvVar = (jkv) this.a;
                return jco.j(jkvVar.f.a(), new jku(jkvVar, 0), jkvVar.h);
            case 2:
                Void r103 = (Void) obj;
                jkv jkvVar2 = (jkv) this.a;
                return jco.j(jkvVar2.f.a(), new jke(jkvVar2, 15), jkvVar2.h);
            case 3:
                Void r104 = (Void) obj;
                return ((jkv) this.a).d.f();
            case 4:
                Object obj2 = this.a;
                if (((Boolean) obj).booleanValue()) {
                    return mkk.a;
                }
                jmk.f("%s Clearing MDD since FileManager failed or needs migration.", "MDDManager");
                return ((jkv) obj2).a();
            case 5:
                Object obj3 = this.a;
                if (((Boolean) obj).booleanValue()) {
                    return mkk.a;
                }
                jmk.f("%s Clearing MDD since FilesMetadata failed or needs migration.", "MDDManager");
                return ((jkv) obj3).a();
            case 6:
                Void r105 = (Void) obj;
                jkv jkvVar3 = (jkv) this.a;
                SharedPreferences q = jez.q(jkvVar3.b, "gms_icing_mdd_manager_metadata", jkvVar3.g);
                if (!q.contains("gms_icing_mdd_reset_trigger")) {
                    SharedPreferences.Editor edit = q.edit();
                    jkvVar3.j.x();
                    edit.putInt("gms_icing_mdd_reset_trigger", 0).commit();
                }
                int i = q.getInt("gms_icing_mdd_reset_trigger", 0);
                jkvVar3.j.x();
                if (i >= 0) {
                    return mkk.a;
                }
                q.edit().putInt("gms_icing_mdd_reset_trigger", 0).commit();
                int i2 = jmk.a;
                jli jliVar = jkvVar3.e;
                return jco.j(jco.j(jliVar.b.c(), new jku(jliVar, 8), jliVar.i), new jku(jkvVar3, 2), jkvVar3.h);
            case 7:
                Void r106 = (Void) obj;
                jkw jkwVar = (jkw) this.a;
                return jkwVar.b.b(jkc.k, jkwVar.a);
            case 8:
                Object obj4 = this.a;
                List<jit> list = (List) obj;
                ArrayList arrayList = new ArrayList();
                try {
                    for (jit jitVar : list) {
                        arrayList.add(((jli) obj4).a(jitVar));
                    }
                } catch (Exception unused) {
                }
                jli jliVar2 = (jli) obj4;
                return jez.p(arrayList).b(new clc(jliVar2, 8), jliVar2.i);
            case 9:
                Object obj5 = this.a;
                if (!((Boolean) obj).booleanValue()) {
                    jmk.c("%s: Unable to write back subscription for file entry with %s", "SharedFileManager", obj5);
                    return kcu.K(false);
                }
                return kcu.K(true);
            case 10:
                Object obj6 = this.a;
                jiu jiuVar = (jiu) obj;
                if (jiuVar == null) {
                    jmk.c("%s: getSharedFile called on file that doesn't exists! Key = %s", "SharedFileManager", obj6);
                    return kcu.J(new jlj());
                }
                return kcu.K(jiuVar);
            case 11:
                Object obj7 = this.a;
                if (!((Boolean) obj).booleanValue()) {
                    jmk.c("%s: Unable to modify file subscription for key %s", "SharedFileManager", obj7);
                    return kcu.K(false);
                }
                return kcu.K(true);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                Object obj8 = this.a;
                List<jiq> list2 = (List) obj;
                ArrayList arrayList2 = new ArrayList();
                for (jiq jiqVar : list2) {
                    arrayList2.add(((jll) obj8).g(jiqVar));
                }
                return jez.p(arrayList2).b(new dus(list2, arrayList2, 11), ((jll) obj8).a);
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(this.a, (IOException) obj);
                } catch (Exception unused2) {
                }
                return mkk.a;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Void r107 = (Void) obj;
                return kcu.J((Throwable) this.a);
            case 15:
                Object obj9 = this.a;
                jiu jiuVar2 = (jiu) obj;
                if (jiuVar2 == null) {
                    jmk.c("%s: Shared file not found, newFileKey = %s", "DownloaderCallbackImpl", obj9);
                    nzv a = jhv.a();
                    a.a = jhu.SHARED_FILE_NOT_FOUND_ERROR;
                    return kcu.J(a.e());
                }
                return kcu.K(jiuVar2);
            case 16:
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke((Throwable) this.a, (IOException) obj);
                return mkk.a;
            case 17:
                Void r108 = (Void) obj;
                return kcu.J((Throwable) this.a);
            case 18:
                Object obj10 = this.a;
                if (((Boolean) obj).booleanValue()) {
                    return mkk.a;
                }
                jmk.c("%s: Unable to write back download info for file entry with %s", "DownloaderCallbackImpl", obj10);
                nzv a2 = jhv.a();
                a2.a = jhu.UNABLE_TO_UPDATE_FILE_STATE_ERROR;
                return kcu.J(a2.e());
            case 19:
                Void r109 = (Void) obj;
                throw ((Throwable) this.a);
            default:
                Boolean bool = (Boolean) obj;
                return kcu.K(this.a);
        }
    }
}
