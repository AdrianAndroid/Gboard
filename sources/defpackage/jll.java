package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jll  reason: default package */
/* loaded from: classes.dex */
public final class jll implements jkl {
    public final Executor a;
    private final Context b;
    private final jjd c;
    private final lfb d;

    public jll(Context context, jjd jjdVar, lfb lfbVar, Executor executor) {
        this.b = context;
        this.c = jjdVar;
        this.d = lfbVar;
        this.a = executor;
    }

    @Override // defpackage.jkl
    public final mko a(jig jigVar) {
        int i = jmk.a;
        jig az = lre.az(jigVar, (this.c.a() / 1000) + jigVar.i);
        ArrayList arrayList = new ArrayList();
        arrayList.add(az);
        return m(arrayList);
    }

    @Override // defpackage.jkl
    public final mko b() {
        jez.q(this.b, "gms_icing_mdd_groups", this.d).edit().clear().commit();
        jez.q(this.b, "gms_icing_mdd_group_key_properties", this.d).edit().clear().commit();
        return k();
    }

    @Override // defpackage.jkl
    public final mko c() {
        return jco.j(d(), new jku(this, 12), this.a);
    }

    @Override // defpackage.jkl
    public final mko d() {
        ArrayList arrayList = new ArrayList();
        SharedPreferences q = jez.q(this.b, "gms_icing_mdd_groups", this.d);
        SharedPreferences.Editor editor = null;
        for (String str : q.getAll().keySet()) {
            try {
                arrayList.add(lre.at(str));
            } catch (jmq e) {
                jmk.h(e, "Failed to deserialize groupKey:".concat(String.valueOf(str)));
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    @Override // defpackage.jkl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.mko e() {
        /*
            r8 = this;
            java.lang.String r0 = "FileGroupsMetadataUtil"
            android.content.Context r1 = r8.b
            lfb r2 = r8.d
            java.io.File r1 = defpackage.lre.au(r1, r2)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L5b
            r2.<init>(r1)     // Catch: java.io.FileNotFoundException -> L5b
            r3 = 0
            r4 = 1
            long r5 = r1.length()     // Catch: java.lang.IllegalArgumentException -> L4c
            int r1 = (int) r5     // Catch: java.lang.IllegalArgumentException -> L4c
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)     // Catch: java.lang.IllegalArgumentException -> L4c
            java.nio.channels.FileChannel r5 = j$.wrapper.java.io.FileInputStreamWrapper.getChannel(r2)     // Catch: java.io.IOException -> L39
            r5.read(r1)     // Catch: java.io.IOException -> L39
            r1.rewind()     // Catch: java.io.IOException -> L39
            java.lang.Class<jig> r5 = defpackage.jig.class
            jig r6 = defpackage.jig.v     // Catch: java.io.IOException -> L39
            r7 = 7
            java.lang.Object r6 = r6.N(r7)     // Catch: java.io.IOException -> L39
            nhf r6 = (defpackage.nhf) r6     // Catch: java.io.IOException -> L39
            java.util.List r1 = defpackage.lre.as(r1, r5, r6)     // Catch: java.io.IOException -> L39
            r2.close()     // Catch: java.io.IOException -> L37
            goto L45
        L37:
            r2 = move-exception
            goto L3c
        L39:
            r1 = move-exception
            r2 = r1
            r1 = 0
        L3c:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r0
            java.lang.String r0 = "%s: IOException occurred while reading file groups."
            defpackage.jmk.e(r2, r0, r4)
        L45:
            if (r1 != 0) goto L64
            llp r1 = defpackage.llp.q()
            goto L64
        L4c:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r3] = r0
            java.lang.String r0 = "%s: Exception while reading from stale groups into buffer."
            defpackage.jmk.e(r1, r0, r2)
            llp r1 = defpackage.llp.q()
            goto L64
        L5b:
            r1.getAbsolutePath()
            int r0 = defpackage.jmk.a
            llp r1 = defpackage.llp.q()
        L64:
            mko r0 = defpackage.kcu.K(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jll.e():mko");
    }

    @Override // defpackage.jkl
    public final mko f() {
        return mkk.a;
    }

    @Override // defpackage.jkl
    public final mko g(jiq jiqVar) {
        return kcu.K((jig) jez.s(jez.q(this.b, "gms_icing_mdd_groups", this.d), lre.av(jiqVar), (nhf) jig.v.N(7)));
    }

    @Override // defpackage.jkl
    public final mko h(jiq jiqVar) {
        return kcu.K((jir) jez.s(jez.q(this.b, "gms_icing_mdd_group_key_properties", this.d), lre.av(jiqVar), (nhf) jir.b.N(7)));
    }

    @Override // defpackage.jkl
    public final mko i(jiq jiqVar) {
        return kcu.K(Boolean.valueOf(jez.x(jez.q(this.b, "gms_icing_mdd_groups", this.d), lre.av(jiqVar))));
    }

    @Override // defpackage.jkl
    public final mko j(List list) {
        SharedPreferences.Editor edit = jez.q(this.b, "gms_icing_mdd_groups", this.d).edit();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jiq jiqVar = (jiq) it.next();
            String str = jiqVar.b;
            String str2 = jiqVar.c;
            int i = jmk.a;
            edit.remove(jez.u(jiqVar));
        }
        return kcu.K(Boolean.valueOf(edit.commit()));
    }

    @Override // defpackage.jkl
    public final mko k() {
        n().delete();
        return mkk.a;
    }

    @Override // defpackage.jkl
    public final mko l(jiq jiqVar, jig jigVar) {
        return kcu.K(Boolean.valueOf(jez.y(jez.q(this.b, "gms_icing_mdd_groups", this.d), lre.av(jiqVar), jigVar)));
    }

    @Override // defpackage.jkl
    public final mko m(List list) {
        File n = n();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(n, true);
            try {
                ByteBuffer ar = lre.ar(list);
                if (ar != null) {
                    fileOutputStream.getChannel().write(ar);
                }
                fileOutputStream.close();
                return kcu.K(true);
            } catch (IOException unused) {
                jmk.a("IOException occurred while writing file groups.");
                return kcu.K(false);
            }
        } catch (FileNotFoundException unused2) {
            jmk.b("File %s not found while writing.", n.getAbsolutePath());
            return kcu.K(false);
        }
    }

    final File n() {
        return lre.au(this.b, this.d);
    }
}
