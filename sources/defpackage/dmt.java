package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.ArrayAdapter;
import com.google.android.inputmethod.latin.R;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* renamed from: dmt  reason: default package */
/* loaded from: classes.dex */
public final class dmt {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/languageselection/KeyAssignmentUtils");

    public static long a(KeyEvent keyEvent) {
        long j = 0;
        long keyCode = keyEvent.getKeyCode() | (true != keyEvent.isShiftPressed() ? 0L : 4294967296L) | (true != keyEvent.isCtrlPressed() ? 0L : 17592186044416L);
        if (true == keyEvent.isAltPressed()) {
            j = 8589934592L;
        }
        return keyCode | j;
    }

    public static lmz b(Context context, int i) {
        return c(context, context.getString(i));
    }

    public static lmz c(Context context, String str) {
        ino M = ino.M(context);
        lmx g = lmz.g();
        for (String str2 : M.e(str, lrr.a)) {
            try {
                g.d(Long.valueOf(str2));
            } catch (NumberFormatException e) {
                ((ltd) ((ltd) ((ltd) a.d()).i(e)).k("com/google/android/apps/inputmethod/libs/languageselection/KeyAssignmentUtils", "getKeyCodesForPreference", ';', "KeyAssignmentUtils.java")).s();
            }
        }
        return g.g();
    }

    public static String d(long j, Context context) {
        if (j == -1) {
            return context.getString(R.string.f159010_resource_name_obfuscated_res_0x7f14058e);
        }
        StringBuilder sb = new StringBuilder();
        if ((17592186044416L & j) != 0) {
            sb.append(context.getString(R.string.f154860_resource_name_obfuscated_res_0x7f140398));
        }
        if ((8589934592L & j) != 0) {
            sb.append(context.getString(R.string.f154850_resource_name_obfuscated_res_0x7f140397));
        }
        if ((4294967296L & j) != 0) {
            sb.append(context.getString(R.string.f154890_resource_name_obfuscated_res_0x7f14039b));
        }
        int i = (int) j;
        KeyEvent keyEvent = new KeyEvent(0, i);
        char displayLabel = keyEvent.getDisplayLabel();
        if (displayLabel == 0 || Character.isWhitespace(displayLabel)) {
            if (keyEvent.getKeyCode() == 61) {
                sb.append(context.getString(R.string.f158420_resource_name_obfuscated_res_0x7f14054e));
            } else {
                sb.append(KeyEvent.keyCodeToString(i));
            }
        } else {
            sb.append(displayLabel);
        }
        return sb.toString();
    }

    public static void e(ArrayAdapter arrayAdapter, Set set, Context context) {
        arrayAdapter.clear();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayAdapter.add(d(((Long) it.next()).longValue(), context));
        }
        arrayAdapter.sort(xr.j);
    }
}
