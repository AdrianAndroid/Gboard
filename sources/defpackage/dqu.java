package defpackage;

import android.content.Context;
import android.util.Printer;
import java.io.File;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* compiled from: PG */
/* renamed from: dqu  reason: default package */
/* loaded from: classes.dex */
public final class dqu implements ifw, gvl {
    private final jan c = jan.b;
    private final Context d;
    private static final ltg b = ltg.j("com/google/android/apps/inputmethod/libs/mozc/extension/MozcBackupDataProviderModule");
    static final llp a = llp.v(".encrypt_key.db", ".history.db", ".registry.db", "boundary.db", "cform.db", "segment.db");

    public dqu(Context context) {
        this.d = context;
    }

    private final File i(String str) {
        return new File(h(), String.valueOf(str).concat(".old"));
    }

    private static boolean j() {
        return dsn.m() && dsn.a().l();
    }

    @Override // defpackage.gvl
    public final String c() {
        return "user_history";
    }

    @Override // defpackage.gvl
    public final String d() {
        return "mozc";
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.gvl
    public final void e(gvk gvkVar) {
        if (j()) {
            dsn a2 = dsn.a();
            nfh t = ggh.o.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            ggh gghVar = (ggh) t.b;
            gghVar.b = 8;
            gghVar.a |= 1;
            a2.b((ggh) t.cz());
        }
        HashSet<String> hashSet = new HashSet(a);
        if (!this.c.g(new File(h(), ".history.db")) || !this.c.g(new File(h(), ".encrypt_key.db"))) {
            hashSet.remove(".history.db");
            hashSet.remove(".encrypt_key.db");
        }
        for (String str : hashSet) {
            ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/libs/mozc/extension/MozcBackupDataProviderModule", "backupFiles", 83, "MozcBackupDataProviderModule.java")).H("Backed up: %s, result=%s", str, gvkVar.b("mozc", str, new File(h(), str)));
        }
    }

    @Override // defpackage.gvj
    public final /* synthetic */ boolean f(boolean z, boolean z2) {
        return hgw.h(z, z2);
    }

    @Override // defpackage.gvl
    public final Collection g(Map map) {
        File h = h();
        if (!h.isDirectory()) {
            this.c.e(h);
            this.c.b(h.getAbsolutePath());
            ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/libs/mozc/extension/MozcBackupDataProviderModule", "restoreFiles", 94, "MozcBackupDataProviderModule.java")).w("Created directory %s", h);
        }
        HashSet<String> hashSet = new HashSet();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            File file = new File(h, str);
            File i = i(str);
            if (this.c.g(file)) {
                if (!this.c.i(file, i)) {
                    ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/mozc/extension/MozcBackupDataProviderModule", "restoreFiles", 113, "MozcBackupDataProviderModule.java")).G("Failed in moving %s to %s", file, i);
                } else {
                    ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/libs/mozc/extension/MozcBackupDataProviderModule", "restoreFiles", 116, "MozcBackupDataProviderModule.java")).G("Moved %s to %s", file, i);
                }
            } else {
                ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/libs/mozc/extension/MozcBackupDataProviderModule", "restoreFiles", 118, "MozcBackupDataProviderModule.java")).w("Skipped moving non-existent %s", file);
            }
            if (!this.c.j((File) entry.getValue(), file)) {
                this.c.i(i, file);
                ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/mozc/extension/MozcBackupDataProviderModule", "restoreFiles", 123, "MozcBackupDataProviderModule.java")).G("Failed in moving/copying %s to %s", entry.getValue(), file);
            } else {
                ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/libs/mozc/extension/MozcBackupDataProviderModule", "restoreFiles", 126, "MozcBackupDataProviderModule.java")).G("Restored %s as key=%s", file, str);
                hashSet.add(str);
            }
        }
        File file2 = (File) map.get(".history.db");
        File file3 = (File) map.get(".encrypt_key.db");
        if (file3 == null && file2 != null) {
            File file4 = new File(h, ".history.db");
            this.c.i(file4, file2);
            this.c.i(i(".history.db"), file4);
            hashSet.remove(".history.db");
            ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/mozc/extension/MozcBackupDataProviderModule", "restoreFiles", 137, "MozcBackupDataProviderModule.java")).G("%s was found but %s was not. Canceling the restoration.", ".history.db", ".encrypt_key.db");
        } else if (file3 != null && file2 == null) {
            File file5 = new File(h, ".encrypt_key.db");
            this.c.i(file5, file3);
            this.c.i(i(".encrypt_key.db"), file5);
            hashSet.remove(".encrypt_key.db");
            ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/mozc/extension/MozcBackupDataProviderModule", "restoreFiles", 145, "MozcBackupDataProviderModule.java")).G("%s was found but %s was not. Canceling the restoration.", ".encrypt_key.db", ".history.db");
        }
        if (j()) {
            dsn.a().h();
            ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/libs/mozc/extension/MozcBackupDataProviderModule", "restoreFiles", 153, "MozcBackupDataProviderModule.java")).t("Reloaded Mozc engine");
        }
        for (String str2 : hashSet) {
            File i2 = i(str2);
            ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/libs/mozc/extension/MozcBackupDataProviderModule", "restoreFiles", 159, "MozcBackupDataProviderModule.java")).H("Deleted %s, result = %s", i2, this.c.e(i2));
        }
        return hashSet;
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        dsn.n(context, dso.a);
    }

    @Override // defpackage.ifw
    public final void gn() {
    }

    final File h() {
        return new File(this.d.getApplicationInfo().dataDir, ".mozc");
    }
}
