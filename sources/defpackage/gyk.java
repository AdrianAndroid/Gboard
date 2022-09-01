package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: gyk  reason: default package */
/* loaded from: classes.dex */
public final class gyk extends gyj {
    private static final lug b = hin.a;
    private static final String[] c = {"display_name", "starred", "times_contacted", "last_time_contacted", "in_visible_group", "data3", "data5", "data2", "data9", "data8", "data7", "mimetype", "data1"};
    private static final hhl l = hhq.a("enable_force_import_contacts_data_for_test", false);
    private static volatile gyk m;
    public volatile boolean a;
    private final long n;
    private final long o;
    private final long p;
    private final long q;
    private final Runnable r = new gxd(this, 4);

    private gyk(Context context) {
        super(context, "ContactsDataManager");
        Resources resources = context.getResources();
        this.n = resources.getInteger(R.integer.f131160_resource_name_obfuscated_res_0x7f0c001a);
        this.o = resources.getInteger(R.integer.f131130_resource_name_obfuscated_res_0x7f0c0017);
        this.p = resources.getInteger(R.integer.f131140_resource_name_obfuscated_res_0x7f0c0018);
        this.q = resources.getInteger(R.integer.f131150_resource_name_obfuscated_res_0x7f0c0019);
    }

    public static String A(Object[] objArr) {
        Object obj = objArr[11];
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public static boolean C(Object[] objArr) {
        Object obj = objArr[4];
        return (obj instanceof Integer) && ((Integer) obj).intValue() != 0;
    }

    public static boolean D(Object[] objArr) {
        Object obj = objArr[1];
        return (obj instanceof Integer) && ((Integer) obj).intValue() != 0;
    }

    private final void E() {
        if (this.a || !this.j) {
            return;
        }
        this.a = true;
        this.h.postDelayed(this.r, this.f.D("user_contacts_count") == 0 ? this.o : this.n);
    }

    public static int d(Object[] objArr) {
        Object obj = objArr[2];
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public static long e(Object[] objArr) {
        Object obj = objArr[3];
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0L;
    }

    public static gyk i(Context context) {
        gyk gykVar = m;
        if (gykVar == null) {
            synchronized (gyk.class) {
                gykVar = m;
                if (gykVar == null) {
                    gykVar = new gyk(context.getApplicationContext());
                    gykVar.q();
                    m = gykVar;
                }
            }
        }
        return gykVar;
    }

    public static Object m(Object[] objArr, String str) {
        int i = 0;
        while (true) {
            String[] strArr = c;
            int length = strArr.length;
            if (i < 13) {
                if (strArr[i].equals(str)) {
                    return objArr[i];
                }
                i++;
            } else {
                ((luc) b.a(hip.a).k("com/google/android/libraries/inputmethod/contentdata/ContactsDataManager", "getDataByColumnName", 95, "ContactsDataManager.java")).w("Unexpected columnName %s", str);
                return null;
            }
        }
    }

    public static String z(Object[] objArr) {
        return (String) objArr[0];
    }

    public final synchronized void B() {
        this.f.h("user_contacts_count", 0);
        this.f.i("user_contacts_import_timestamp", 0L);
    }

    @Override // defpackage.gyj
    public final int c() {
        return R.string.f161460_resource_name_obfuscated_res_0x7f1406b3;
    }

    @Override // defpackage.gyj
    protected final Uri f() {
        return ContactsContract.Data.CONTENT_URI;
    }

    @Override // defpackage.gyj
    public final ido g() {
        return gyl.CONTENT_DATA_MANAGER_CONTACTS_RUN;
    }

    @Override // defpackage.gyj
    public final ids h() {
        return gym.CONTENT_DATA_MANAGER_CONTACTS_RUN;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gyj
    public final synchronized void j() {
        ((luc) ((luc) this.e.b()).k("com/google/android/libraries/inputmethod/contentdata/ContactsDataManager", "onContentChanged", 155, "ContactsDataManager.java")).t("onContentChanged()");
        E();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gyj
    public final synchronized void k(int i, int i2) {
        ((luc) ((luc) this.e.b()).k("com/google/android/libraries/inputmethod/contentdata/ContactsDataManager", "onImportFinished", 250, "ContactsDataManager.java")).y("onImportFinished() : Result = %d : Count = %d", i, i2);
        if (i == 2) {
            this.f.h("user_contacts_count", i2);
        }
        this.f.i("user_contacts_import_timestamp", System.currentTimeMillis());
    }

    @Override // defpackage.gyj
    protected final void l(boolean z) {
        ((luc) ((luc) this.e.b()).k("com/google/android/libraries/inputmethod/contentdata/ContactsDataManager", "onShouldImportChanged", 192, "ContactsDataManager.java")).w("onShouldImportChanged() : ShouldImport = %b", Boolean.valueOf(z));
        if (z) {
            this.f.h("user_contacts_count", 0);
            this.f.i("user_contacts_import_timestamp", 0L);
            E();
            return;
        }
        this.a = false;
        this.h.removeCallbacks(this.r);
    }

    @Override // defpackage.gyj
    protected final synchronized boolean n(Cursor cursor) {
        if (((Boolean) l.c()).booleanValue()) {
            return true;
        }
        int D = this.f.D("user_contacts_count");
        long I = this.f.I("user_contacts_import_timestamp");
        long currentTimeMillis = System.currentTimeMillis();
        if (D == 0) {
            if (currentTimeMillis - I < this.q) {
                return false;
            }
            D = 0;
        }
        if (cursor.getCount() == D) {
            if (currentTimeMillis - I < this.p) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.gyj
    protected final String[] o() {
        return c;
    }

    @Override // defpackage.gyj
    protected final synchronized boolean y() {
        if (this.f.I("user_contacts_import_timestamp") == 0) {
            if (this.f.D("user_contacts_count") == 0) {
                return true;
            }
        }
        return false;
    }
}
