package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Printer;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* renamed from: bvg  reason: default package */
/* loaded from: classes.dex */
public final class bvg implements gvl, ifw {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/clipboard/ClipboardBackupDataProviderModule");
    private final Context b;

    public bvg(Context context) {
        this.b = context;
    }

    @Override // defpackage.gvl
    public final String c() {
        return "clipboard";
    }

    @Override // defpackage.gvl
    public final String d() {
        return "clipboard";
    }

    @Override // defpackage.gzv
    public final /* synthetic */ void dump(Printer printer, boolean z) {
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[Catch: RuntimeException -> 0x0088, TRY_ENTER, TRY_LEAVE, TryCatch #6 {RuntimeException -> 0x0088, blocks: (B:3:0x0027, B:20:0x0064, B:5:0x0033, B:8:0x003a, B:9:0x0046, B:11:0x004c, B:13:0x0052, B:15:0x0055, B:18:0x0059, B:83:0x005e), top: B:2:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
    @Override // defpackage.gvl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(defpackage.gvk r20) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvg.e(gvk):void");
    }

    @Override // defpackage.gvj
    public final /* synthetic */ boolean f(boolean z, boolean z2) {
        return hgw.h(z, z2);
    }

    @Override // defpackage.gvl
    public final Collection g(Map map) {
        File file = (File) map.get("tmp_clipboard_backup_data");
        bwy bwyVar = null;
        if (file == null || !file.exists()) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardBackupDataProviderModule", "parseBackupData", 138, "ClipboardBackupDataProviderModule.java")).t("There is no clipboard backup data file.");
        } else {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    bwy bwyVar2 = (bwy) nfm.x(bwy.d, fileInputStream, nfb.b());
                    fileInputStream.close();
                    bwyVar = bwyVar2;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    }
                    throw th;
                }
            } catch (IOException | SecurityException e) {
                ((ltd) ((ltd) ((ltd) a.c()).i(e)).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardBackupDataProviderModule", "parseBackupData", (char) 145, "ClipboardBackupDataProviderModule.java")).t("Failed to parse clipboard backup data file.");
            }
        }
        if (bwyVar == null) {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardBackupDataProviderModule", "restoreFiles", 94, "ClipboardBackupDataProviderModule.java")).t("No clipboard backup data");
            return llp.q();
        } else if (bwyVar.b <= 4) {
            for (bww bwwVar : bwyVar.c) {
                buj g = buk.g();
                g.a = bwwVar.b;
                g.b = bwwVar.c;
                if ((bwwVar.a & 8) != 0) {
                    bwx bwxVar = bwwVar.e;
                    if (bwxVar == null) {
                        bwxVar = bwx.h;
                    }
                    g.e(bwxVar.b);
                    g.c(bwxVar.c);
                    g.d(bwxVar.d);
                    g.b(bwxVar.e);
                    g.f(Uri.parse(bwxVar.f));
                    g.c.c(bwxVar.g);
                }
                buk a2 = g.a();
                a2.f = bwwVar.d;
                String j = a2.j();
                if (!TextUtils.isEmpty(j)) {
                    File e2 = bvu.e(this.b, j);
                    if (e2 == null) {
                        ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardBackupDataProviderModule", "restoreImageFile", 115, "ClipboardBackupDataProviderModule.java")).w("The uri(%s) doesn't refer to the internal clipboard image", j);
                    } else {
                        File file2 = (File) map.get(e2.getName());
                        if (file2 == null) {
                            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardBackupDataProviderModule", "restoreImageFile", 120, "ClipboardBackupDataProviderModule.java")).w("There is no backup file for uri %s", j);
                        } else if (!bvu.j(this.b)) {
                            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardBackupDataProviderModule", "restoreImageFile", 125, "ClipboardBackupDataProviderModule.java")).t("Failed to create clipboard image directory");
                        } else if (!jan.b.i(file2, e2)) {
                            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardBackupDataProviderModule", "restoreImageFile", 130, "ClipboardBackupDataProviderModule.java")).t("Failed to move backup file to the clipboard image file");
                        }
                    }
                }
                Context context = this.b;
                ContentValues contentValues = new ContentValues();
                contentValues.put("_id", Long.valueOf(a2.d));
                contentValues.put("text", a2.i());
                contentValues.put("html_text", a2.h());
                contentValues.put("timestamp", Long.valueOf(a2.e));
                contentValues.put("item_type", Integer.valueOf(a2.d()));
                contentValues.put("entity_type", Integer.valueOf(a2.c()));
                contentValues.put("uri", a2.j());
                context.getContentResolver().insert(bvi.b(context, 1, 0L), contentValues);
            }
            return map.keySet();
        } else {
            ((ltd) ((ltd) a.d()).k("com/google/android/apps/inputmethod/libs/clipboard/ClipboardBackupDataProviderModule", "restoreFiles", 99, "ClipboardBackupDataProviderModule.java")).t("The backup data DB version is larger than current DB version");
            return llp.q();
        }
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "ClipboardBackupDataProviderModule";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
    }

    @Override // defpackage.ifw
    public final void gn() {
    }
}
