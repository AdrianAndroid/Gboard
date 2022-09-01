package defpackage;

import android.content.Context;
import android.util.Printer;
import java.io.File;
import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* renamed from: epi  reason: default package */
/* loaded from: classes.dex */
public final class epi implements gvl, ifw {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/theme/backup/ThemeBackupDataProviderModule");
    private final Context b;

    public epi(Context context) {
        this.b = context;
    }

    @Override // defpackage.gvl
    public final String c() {
        return "theme";
    }

    @Override // defpackage.gvl
    public final String d() {
        return "customized_theme";
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    @Override // defpackage.gvl
    public final void e(gvk gvkVar) {
        File[] a2;
        for (File file : evf.a(this.b)) {
            gvkVar.b("customized_theme", file.getName(), file);
        }
    }

    @Override // defpackage.gvj
    public final /* synthetic */ boolean f(boolean z, boolean z2) {
        return hgw.h(z, z2);
    }

    @Override // defpackage.gvl
    public final Collection g(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            Context context = this.b;
            File file = (File) entry.getValue();
            String str = (String) entry.getKey();
            File filesDir = context.getFilesDir();
            if (filesDir.exists() || filesDir.mkdirs()) {
                File file2 = new File(filesDir, str);
                if (!jan.b.c(file, file2)) {
                    ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/theme/backup/ThemeBackupDataProviderModule", "copyUserThemeFileToTheDirectory", 67, "ThemeBackupDataProviderModule.java")).w("Failed to copy the user theme file: %s", str);
                    jan.b.e(file2);
                }
            } else {
                ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/theme/backup/ThemeBackupDataProviderModule", "copyUserThemeFileToTheDirectory", 61, "ThemeBackupDataProviderModule.java")).w("Could not create the user theme directory %s", filesDir);
            }
        }
        return map.keySet();
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
    }

    @Override // defpackage.ifw
    public final void gn() {
    }
}
