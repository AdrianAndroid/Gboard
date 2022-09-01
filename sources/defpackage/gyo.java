package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.UserDictionary;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: gyo  reason: default package */
/* loaded from: classes.dex */
public class gyo extends gyj {
    public static final String[] a = {"word", "frequency", "locale", "shortcut"};
    public volatile boolean b = true;
    private volatile boolean c = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public gyo(Context context) {
        super(context, "ShortcutsDataManager");
    }

    public static int d(Object[] objArr) {
        Object obj = objArr[1];
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public static String e(Object[] objArr) {
        return (String) objArr[2];
    }

    public static String i(Object[] objArr) {
        return (String) objArr[3];
    }

    public static String m(Object[] objArr) {
        return (String) objArr[0];
    }

    public final synchronized void A() {
        if (!B() || this.c) {
            return;
        }
        this.c = true;
        t();
    }

    public boolean B() {
        return this.b;
    }

    @Override // defpackage.gyj
    public final int c() {
        return R.string.f161020_resource_name_obfuscated_res_0x7f140686;
    }

    @Override // defpackage.gyj
    protected final Uri f() {
        return UserDictionary.Words.CONTENT_URI;
    }

    @Override // defpackage.gyj
    public final ido g() {
        return gyl.CONTENT_DATA_MANAGER_SHORTCUTS_RUN;
    }

    @Override // defpackage.gyj
    public final ids h() {
        return gym.CONTENT_DATA_MANAGER_SHORTCUTS_RUN;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gyj
    public final synchronized void j() {
        ((luc) ((luc) this.e.b()).k("com/google/android/libraries/inputmethod/contentdata/ShortcutsDataManager", "onContentChanged", 70, "ShortcutsDataManager.java")).t("onContentChanged()");
        this.b = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gyj
    public synchronized void k(int i, int i2) {
        ((luc) ((luc) this.e.b()).k("com/google/android/libraries/inputmethod/contentdata/ShortcutsDataManager", "onImportFinished", 80, "ShortcutsDataManager.java")).y("onImportFinished() : Result = %d : Count = %d", i, i2);
        if (i == 2) {
            this.b = false;
        }
        this.c = false;
    }

    @Override // defpackage.gyj
    protected final void l(boolean z) {
        ((luc) ((luc) this.e.b()).k("com/google/android/libraries/inputmethod/contentdata/ShortcutsDataManager", "onShouldImportChanged", 117, "ShortcutsDataManager.java")).w("onShouldImportChanged() : ShouldImport = %s", Boolean.valueOf(z));
        if (z) {
            this.c = true;
            t();
        }
    }

    @Override // defpackage.gyj
    protected final String[] o() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gyj
    public final synchronized void r() {
        super.r();
        this.c = false;
    }

    @Override // defpackage.gyj
    protected final boolean x() {
        return true;
    }

    public final synchronized void z() {
        if (!this.c) {
            this.c = true;
            t();
        }
    }
}
