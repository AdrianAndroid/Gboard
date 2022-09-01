package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import com.google.android.inputmethod.latin.R;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: PG */
/* renamed from: dqh  reason: default package */
/* loaded from: classes.dex */
final class dqh implements mka {
    final /* synthetic */ gzh a;
    final /* synthetic */ boolean b;
    final /* synthetic */ Window c;
    final /* synthetic */ IBinder d;
    final /* synthetic */ dqi e;

    public dqh(dqi dqiVar, gzh gzhVar, boolean z, Window window, IBinder iBinder) {
        this.e = dqiVar;
        this.a = gzhVar;
        this.b = z;
        this.c = window;
        this.d = iBinder;
    }

    @Override // defpackage.mka
    public final void a(Throwable th) {
        ((ltd) ((ltd) ((ltd) dqi.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/migration/MigrationHelper$1", "onFailure", 'n', "MigrationHelper.java")).t("Failed to get method getInputMethodEntry future callback.");
    }

    @Override // defpackage.mka
    public final /* synthetic */ void b(Object obj) {
        mcp mcpVar;
        mcn mcnVar;
        List<hqt> list = (List) obj;
        if (this.a != null) {
            ino M = ino.M(this.e.c);
            dqi dqiVar = this.e;
            String str = this.a.e;
            if (!list.isEmpty()) {
                lvw.e(new cae(dqiVar, 9));
                llp b = hqr.b();
                dqiVar.b(list, 5);
                if (dqiVar.c.getString(R.string.f154470_resource_name_obfuscated_res_0x7f140371).equals(str)) {
                    dqiVar.e.k((hqt) list.get(0));
                    HashSet hashSet = new HashSet();
                    for (hqt hqtVar : list) {
                        hashSet.add(hqtVar.i());
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet(list);
                    int size = b.size();
                    for (int i = 0; i < size; i++) {
                        hqt hqtVar2 = (hqt) b.get(i);
                        int n = iin.n(dqiVar.c, hqtVar2);
                        if (!hashSet.contains(hqtVar2.i()) || (n != 1 && n != 0)) {
                            linkedHashSet.add(hqtVar2);
                        }
                    }
                    dqiVar.e.l(llp.o(linkedHashSet));
                    if (hashSet.contains(jav.f("ja-JP"))) {
                        M.f("japanese_first_time_user", false);
                    }
                    lvw.e(new cae(dqiVar, 9));
                }
            }
            Context context = this.e.c;
            nga<gzk> ngaVar = this.a.c;
            if (!((Boolean) dqp.b.c()).booleanValue()) {
                ((luc) ((luc) dqp.a.b()).k("com/google/android/apps/inputmethod/libs/migration/PreferenceDataMigrator", "doMigration", 53, "PreferenceDataMigrator.java")).t("Preference data migration is disabled.");
            } else if (ngaVar.size() > 1000) {
                ((luc) ((luc) dqp.a.c()).k("com/google/android/apps/inputmethod/libs/migration/PreferenceDataMigrator", "doMigration", 57, "PreferenceDataMigrator.java")).u("Too many (%s) preferences", ngaVar.size());
            } else {
                lmz w = lmz.w(context.getString(R.string.f161510_resource_name_obfuscated_res_0x7f1406b8), context.getString(R.string.f161480_resource_name_obfuscated_res_0x7f1406b5), context.getString(R.string.f162570_resource_name_obfuscated_res_0x7f140722), context.getString(R.string.f161090_resource_name_obfuscated_res_0x7f14068d), context.getString(R.string.f161040_resource_name_obfuscated_res_0x7f140688), context.getString(R.string.f161110_resource_name_obfuscated_res_0x7f14068f), context.getString(R.string.f161480_resource_name_obfuscated_res_0x7f1406b5), context.getString(R.string.f161470_resource_name_obfuscated_res_0x7f1406b4), context.getString(R.string.f162210_resource_name_obfuscated_res_0x7f1406fe));
                for (gzk gzkVar : ngaVar) {
                    String str2 = gzkVar.c;
                    if (TextUtils.isEmpty(str2)) {
                        ((luc) ((luc) dqp.a.c()).k("com/google/android/apps/inputmethod/libs/migration/PreferenceDataMigrator", "doMigration", 74, "PreferenceDataMigrator.java")).t("empty key is found");
                    } else {
                        gzj gzjVar = gzj.INT_VALUE;
                        int ordinal = gzj.a(gzkVar.a).ordinal();
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                ((luc) ((luc) dqp.a.c()).k("com/google/android/apps/inputmethod/libs/migration/PreferenceDataMigrator", "doMigration", 115, "PreferenceDataMigrator.java")).G("Type %s for %s is not supported", gzj.a(gzkVar.a), str2);
                            } else if (gzkVar.a == 6) {
                                boolean booleanValue = ((Boolean) gzkVar.b).booleanValue();
                                if (w.contains(str2)) {
                                    M.f(str2, booleanValue);
                                } else {
                                    ((luc) ((luc) dqp.a.c()).k("com/google/android/apps/inputmethod/libs/migration/PreferenceDataMigrator", "doMigration", 88, "PreferenceDataMigrator.java")).H("boolean preference (%s, %s) is not supported", str2, booleanValue);
                                }
                            } else {
                                ((luc) ((luc) dqp.a.c()).k("com/google/android/apps/inputmethod/libs/migration/PreferenceDataMigrator", "doMigration", 80, "PreferenceDataMigrator.java")).w("boolean value for %s is missing", str2);
                            }
                        } else if (gzkVar.a == 5) {
                            String str3 = (String) gzkVar.b;
                            if (context.getString(R.string.f161530_resource_name_obfuscated_res_0x7f1406ba).equals(str2)) {
                                try {
                                    int parseInt = Integer.parseInt(str3);
                                    if (parseInt < 50 || parseInt > 1000) {
                                        ((luc) ((luc) dqp.a.c()).k("com/google/android/apps/inputmethod/libs/migration/PreferenceDataMigrator", "verifyHandleLongPressDelay", 126, "PreferenceDataMigrator.java")).w("pref_key_key_long_press_delay has invalid value %s", str3);
                                    } else {
                                        M.j(str2, str3);
                                    }
                                } catch (NumberFormatException unused) {
                                    ((luc) ((luc) dqp.a.c()).k("com/google/android/apps/inputmethod/libs/migration/PreferenceDataMigrator", "verifyHandleLongPressDelay", 130, "PreferenceDataMigrator.java")).w("pref_key_key_long_press_delay has invalid value %s", str3);
                                }
                            } else if (context.getString(R.string.f162210_resource_name_obfuscated_res_0x7f1406fe).equals(str2)) {
                                if (context.getString(R.string.f160150_resource_name_obfuscated_res_0x7f14062c).equals(str3) || context.getString(R.string.f160170_resource_name_obfuscated_res_0x7f14062e).equals(str3) || context.getString(R.string.f160140_resource_name_obfuscated_res_0x7f14062b).equals(str3)) {
                                    M.j(str2, str3);
                                } else {
                                    ((luc) ((luc) dqp.a.c()).k("com/google/android/apps/inputmethod/libs/migration/PreferenceDataMigrator", "verifyHandleOnehandedMode", 141, "PreferenceDataMigrator.java")).w("pref_key_one_handed_mode has invalid value %s", str3);
                                }
                            } else {
                                ((luc) ((luc) dqp.a.c()).k("com/google/android/apps/inputmethod/libs/migration/PreferenceDataMigrator", "doMigration", 111, "PreferenceDataMigrator.java")).G("string preference (%s, %s) is not supported", str2, str3);
                            }
                        } else {
                            ((luc) ((luc) dqp.a.c()).k("com/google/android/apps/inputmethod/libs/migration/PreferenceDataMigrator", "doMigration", 95, "PreferenceDataMigrator.java")).w("String value for %s is missing", str2);
                        }
                    }
                }
            }
        }
        gzh gzhVar = this.a;
        if (gzhVar != null) {
            dqi dqiVar2 = this.e;
            String str4 = gzhVar.e;
            if (str4.equals(dqiVar2.c.getString(R.string.f153430_resource_name_obfuscated_res_0x7f1402f1))) {
                mcpVar = mcp.HANDWRITING;
            } else if (str4.startsWith(dqiVar2.c.getString(R.string.f154470_resource_name_obfuscated_res_0x7f140371))) {
                mcpVar = mcp.JAPANESE_IME;
            } else if (str4.startsWith(dqiVar2.c.getString(R.string.f154230_resource_name_obfuscated_res_0x7f140355))) {
                mcpVar = mcp.INDIC_IME;
            } else {
                ((ltd) dqi.a.a(hip.a).k("com/google/android/apps/inputmethod/libs/migration/MigrationHelper", "getSourceImeName", 240, "MigrationHelper.java")).w("Unknown packageName %s.", str4);
                mcpVar = mcp.IME_UNKNOWN;
            }
        } else {
            mcpVar = mcp.IME_UNKNOWN;
        }
        mcp mcpVar2 = mcpVar;
        ieh j = ieh.j();
        ifs ifsVar = ifs.MIGRATION_LINK_RECEIVING_USAGE;
        Object[] objArr = new Object[3];
        if (this.b) {
            mcnVar = mcn.KEYBOARD;
        } else {
            mcnVar = mcn.SETTINGS;
        }
        objArr[0] = mcnVar;
        objArr[1] = mcpVar2;
        objArr[2] = list;
        j.e(ifsVar, objArr);
        ddc.c(this.e.c);
        dqi dqiVar3 = this.e;
        Window window = this.c;
        IBinder iBinder = this.d;
        boolean z = this.b;
        llp b2 = hqr.b();
        if (window == null) {
            return;
        }
        View decorView = window.getDecorView();
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        dqiVar3.b = new dqg(decorView.getContext(), iBinder, rect.height(), z, b2, mcpVar2);
        dqiVar3.b.show();
    }
}
