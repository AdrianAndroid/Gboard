package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Printer;
import com.google.android.inputmethod.latin.R;
import java.io.File;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: dri  reason: default package */
/* loaded from: classes.dex */
public final class dri implements SharedPreferences.OnSharedPreferenceChangeListener, gzv, inm {
    public static final lug a = hin.a;
    public final Context b;
    public final lgb c;
    public final lgb d;
    public boolean e;
    public final hqq f;
    public boolean g;

    public dri(Context context, Executor executor) {
        drh drhVar = new drh(this);
        this.f = drhVar;
        this.b = context;
        this.c = new drf(context, 1);
        this.d = new drf(context, 0);
        drhVar.d(executor);
    }

    public static File a(File file, String str) {
        int length;
        File[] listFiles = file.listFiles(new cbb(str, 3, (byte[]) null));
        if (listFiles == null || (length = listFiles.length) == 0) {
            ((luc) ((luc) a.c()).k("com/google/android/apps/inputmethod/libs/mozc/ime/MozcInputMethodEntryActivationContentObserver", "getFileFromFolder", 202, "MozcInputMethodEntryActivationContentObserver.java")).t("Downloaded success but no expected file exists");
            return null;
        }
        if (length > 1) {
            ((luc) ((luc) a.d()).k("com/google/android/apps/inputmethod/libs/mozc/ime/MozcInputMethodEntryActivationContentObserver", "getFileFromFolder", 205, "MozcInputMethodEntryActivationContentObserver.java")).t("Multiple files exist.  The first one will be used");
        }
        return listFiles[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [gyg, java.lang.Object] */
    public final void c() {
        if (this.e) {
            ?? a2 = this.d.a();
            ((dre) a2).b.u(a2);
            this.e = false;
            PreferenceManager.getDefaultSharedPreferences(this.b).registerOnSharedPreferenceChangeListener(this);
        }
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        boolean z2 = this.g;
        printer.println("isJapaneseEnabled: " + z2);
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    @Override // defpackage.inm
    public final void go(ino inoVar, String str) {
        onSharedPreferenceChanged(inoVar.J(), str);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (!str.equals(this.b.getString(R.string.f161460_resource_name_obfuscated_res_0x7f1406b3)) || sharedPreferences.getBoolean(str, true)) {
            return;
        }
        Object a2 = this.d.a();
        synchronized (((dre) a2).c) {
            ((dre) a2).c.a("__auto_imported_android_contacts_dictionary", "");
            ((dre) a2).d = null;
        }
    }
}
