package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: jln  reason: default package */
/* loaded from: classes.dex */
public final class jln implements jlk {
    private final Context a;
    private final lfb b;
    private final jhy c;
    private final jlu d;

    public jln(Context context, jlu jluVar, lfb lfbVar, jhy jhyVar) {
        this.a = context;
        this.d = jluVar;
        this.b = lfbVar;
        this.c = jhyVar;
    }

    @Override // defpackage.jlk
    public final mko a() {
        jez.q(this.a, "gms_icing_mdd_shared_files", this.b).edit().clear().commit();
        return kcu.K(null);
    }

    @Override // defpackage.jlk
    public final mko c() {
        ArrayList arrayList = new ArrayList();
        SharedPreferences q = jez.q(this.a, "gms_icing_mdd_shared_files", this.b);
        SharedPreferences.Editor editor = null;
        for (String str : q.getAll().keySet()) {
            try {
                arrayList.add(jez.C(str, this.a));
            } catch (jms e) {
                jmk.h(e, "Failed to deserialize newFileKey:".concat(String.valueOf(str)));
                lfy.e("|").k(str).size();
                if (editor == null) {
                    editor = q.edit();
                }
                editor.remove(str);
            }
        }
        if (editor != null) {
            editor.commit();
        }
        return kcu.K(arrayList);
    }

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.jlk
    public final mko d() {
        jkr a;
        int ordinal;
        Iterator<String> it;
        boolean z;
        Iterator<String> it2;
        int i = 2;
        boolean z2 = false;
        if (kki.u(this.a)) {
            this.c.o();
            jkr a2 = jkr.a(2);
            jkr x = kki.x(this.a);
            int i2 = a2.d;
            int i3 = x.d;
            int i4 = 1;
            if (i2 != i3) {
                if (i2 >= i3) {
                    int i5 = i3 + 1;
                    while (i5 <= a2.d) {
                        try {
                            a = jkr.a(i5);
                            ordinal = a.ordinal();
                        } catch (Throwable th) {
                            if (kki.x(this.a).d != a2.d) {
                                String valueOf = String.valueOf(a2);
                                jmk.a("Failed to commit migration version to disk. Fail to set target version to " + valueOf + ".");
                                String valueOf2 = String.valueOf(a2);
                                new Exception("Fail to set target version " + valueOf2 + ".");
                            }
                            throw th;
                        }
                        if (ordinal == i4) {
                            int i6 = jmk.a;
                            SharedPreferences q = jez.q(this.a, "gms_icing_mdd_shared_files", this.b);
                            SharedPreferences.Editor edit = q.edit();
                            Iterator<String> it3 = q.getAll().keySet().iterator();
                            while (it3.hasNext()) {
                                String next = it3.next();
                                try {
                                    jit C = jez.C(next, this.a);
                                    it = it3;
                                    jiu jiuVar = (jiu) jez.s(q, next, (nhf) jiu.h.N(7));
                                    if (jiuVar == null) {
                                        jmk.b("%s: Unable to read sharedFile from shared preferences.", "SharedFilesMetadata");
                                        edit.remove(next);
                                    } else {
                                        jez.v(edit, next);
                                        jez.w(edit, jez.B(C), jiuVar);
                                    }
                                } catch (jms unused) {
                                    it = it3;
                                    jmk.c("%s Failed to deserialize file key %s, remove and continue.", "SharedFilesMetadata", next);
                                    edit.remove(next);
                                }
                                it3 = it;
                            }
                            if (!edit.commit()) {
                                jmk.a("Failed to commit migration metadata to disk");
                                new Exception("Migrate to DownloadTransform failed.");
                                z = false;
                            }
                            z = true;
                        } else {
                            if (ordinal == i) {
                                int i7 = jmk.a;
                                SharedPreferences q2 = jez.q(this.a, "gms_icing_mdd_shared_files", this.b);
                                SharedPreferences.Editor edit2 = q2.edit();
                                Iterator<String> it4 = q2.getAll().keySet().iterator();
                                while (it4.hasNext()) {
                                    String next2 = it4.next();
                                    try {
                                        jit C2 = jez.C(next2, this.a);
                                        it2 = it4;
                                        jiu jiuVar2 = (jiu) jez.s(q2, next2, (nhf) jiu.h.N(7));
                                        if (jiuVar2 == null) {
                                            jmk.b("%s: Unable to read sharedFile from shared preferences.", "SharedFilesMetadata");
                                            edit2.remove(next2);
                                        } else {
                                            jez.v(edit2, next2);
                                            jez.w(edit2, jez.A(C2), jiuVar2);
                                        }
                                    } catch (jms unused2) {
                                        it2 = it4;
                                        jmk.c("%s Failed to deserialize file key %s, remove and continue.", "SharedFilesMetadata", next2);
                                        edit2.remove(next2);
                                    }
                                    it4 = it2;
                                }
                                if (!edit2.commit()) {
                                    jmk.a("Failed to commit migration metadata to disk");
                                    new Exception("Migrate to ChecksumOnly failed.");
                                    z = false;
                                }
                                z = true;
                            } else {
                                String name = a.name();
                                throw new UnsupportedOperationException("Upgrade to version " + name + "not supported!");
                            }
                            if (kki.x(this.a).d != a2.d && !kki.v(this.a, a2)) {
                                String valueOf3 = String.valueOf(a2);
                                jmk.a("Failed to commit migration version to disk. Fail to set target version to " + valueOf3 + ".");
                                String valueOf22 = String.valueOf(a2);
                                new Exception("Fail to set target version " + valueOf22 + ".");
                            }
                            throw th;
                        }
                        if (z) {
                            kki.v(this.a, jkr.a(i5));
                            i5++;
                            i = 2;
                            i4 = 1;
                        } else {
                            if (kki.x(this.a).d != a2.d && !kki.v(this.a, a2)) {
                                String valueOf4 = String.valueOf(a2);
                                jmk.a("Failed to commit migration version to disk. Fail to set target version to " + valueOf4 + ".");
                                String valueOf5 = String.valueOf(a2);
                                new Exception("Fail to set target version " + valueOf5 + ".");
                            }
                            z2 = false;
                        }
                    }
                    if (kki.x(this.a).d != a2.d && !kki.v(this.a, a2)) {
                        String valueOf6 = String.valueOf(a2);
                        jmk.a("Failed to commit migration version to disk. Fail to set target version to " + valueOf6 + ".");
                        String valueOf7 = String.valueOf(a2);
                        new Exception("Fail to set target version " + valueOf7 + ".");
                    }
                } else {
                    jmk.d("%s Cannot migrate back from value %s to %s. Clear everything!", "SharedFilesMetadata", x, a2);
                    String valueOf8 = String.valueOf(x);
                    String valueOf9 = String.valueOf(a2);
                    new Exception("Downgraded file key from " + valueOf8 + " to " + valueOf9 + ".");
                    kki.v(this.a, a2);
                }
                return kcu.K(Boolean.valueOf(z2));
            }
            z2 = true;
            return kcu.K(Boolean.valueOf(z2));
        }
        int i8 = jmk.a;
        kki.w(this.a);
        Context context = this.a;
        this.c.o();
        kki.v(context, jkr.a(2));
        return kcu.K(false);
    }

    @Override // defpackage.jlk
    public final mko e(jit jitVar) {
        return kcu.K((jiu) jez.s(jez.q(this.a, "gms_icing_mdd_shared_files", this.b), jez.D(jitVar, this.a), (nhf) jiu.h.N(7)));
    }

    @Override // defpackage.jlk
    public final mko f(jit jitVar) {
        return kcu.K(Boolean.valueOf(jez.x(jez.q(this.a, "gms_icing_mdd_shared_files", this.b), jez.D(jitVar, this.a))));
    }

    @Override // defpackage.jlk
    public final mko g(jit jitVar, jiu jiuVar) {
        return kcu.K(Boolean.valueOf(jez.y(jez.q(this.a, "gms_icing_mdd_shared_files", this.b), jez.D(jitVar, this.a), jiuVar)));
    }
}
