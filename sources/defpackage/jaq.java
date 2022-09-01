package defpackage;

import android.content.Context;
import android.inputmethodservice.InputMethodService;
import android.os.IBinder;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: jaq  reason: default package */
/* loaded from: classes.dex */
public final class jaq {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/utils/InputMethodManagerWrapper");
    private static final AtomicReference d = new AtomicReference();
    private static final AtomicReference e = new AtomicReference();
    private static final AtomicReference f = new AtomicReference();
    private static final AtomicReference g = new AtomicReference();
    public final Context b;
    public final InputMethodManager c;

    public jaq(Context context) {
        this.b = context;
        this.c = (InputMethodManager) context.getSystemService("input_method");
    }

    public static void e() {
        e.set(null);
        d.set(null);
        f.set(null);
        g.set(null);
    }

    private static InputMethodInfo m(List list, String str) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InputMethodInfo inputMethodInfo = (InputMethodInfo) it.next();
            if (str.equals(inputMethodInfo.getPackageName())) {
                return inputMethodInfo;
            }
        }
        return null;
    }

    public final IBinder a() {
        Context context = this.b;
        if (context instanceof InputMethodService) {
            return ((InputMethodService) context).getWindow().getWindow().getAttributes().token;
        }
        return null;
    }

    public final InputMethodInfo b() {
        return c(this.b.getApplicationContext().getPackageName());
    }

    public final InputMethodInfo c(String str) {
        try {
            List<InputMethodInfo> list = (List) d.get();
            if (list == null) {
                try {
                    list = this.c.getInputMethodList();
                } catch (RuntimeException e2) {
                    ((ltd) ((ltd) ((ltd) a.c()).i(e2)).k("com/google/android/libraries/inputmethod/utils/InputMethodManagerWrapper", "getInputMethodList", (char) 243, "InputMethodManagerWrapper.java")).t("Failed to get input method list.");
                }
                d.set(m(list, this.b.getApplicationContext().getPackageName()) != null ? list : null);
            }
            return m(list, str);
        } catch (RuntimeException e3) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e3)).k("com/google/android/libraries/inputmethod/utils/InputMethodManagerWrapper", "getInputMethodInfo", 231, "InputMethodManagerWrapper.java")).w("Failed to get InputMethodInfo for %s", str);
            return null;
        }
    }

    public final List d() {
        List<InputMethodInfo> list = (List) e.get();
        if (list == null) {
            try {
                list = this.c.getEnabledInputMethodList();
            } catch (RuntimeException e2) {
                ((ltd) ((ltd) ((ltd) a.c()).i(e2)).k("com/google/android/libraries/inputmethod/utils/InputMethodManagerWrapper", "getEnabledInputMethodList", 'h', "InputMethodManagerWrapper.java")).t("Failed to get enabled input method list.");
            }
            e.set(list);
        }
        return list != null ? list : Collections.emptyList();
    }

    public final void f(InputMethodInfo inputMethodInfo, IBinder iBinder, InputMethodSubtype inputMethodSubtype) {
        try {
            List k = k(inputMethodInfo);
            int size = k.size();
            for (int i = 0; i < size; i++) {
                if (inputMethodSubtype.equals(k.get(i))) {
                    this.c.setInputMethodAndSubtype(iBinder, inputMethodInfo.getId(), inputMethodSubtype);
                    return;
                }
            }
        } catch (RuntimeException e2) {
            ((ltd) ((ltd) ((ltd) a.c()).i(e2)).k("com/google/android/libraries/inputmethod/utils/InputMethodManagerWrapper", "switchToSubtypeOfInputMethod", (char) 551, "InputMethodManagerWrapper.java")).t("Switch subtype failed.");
        }
    }

    public final boolean g() {
        InputMethodInfo b = b();
        return b != null && k(b).size() > 1;
    }

    public final boolean h() {
        return i(this.b.getApplicationContext().getPackageName());
    }

    public final boolean i(String str) {
        for (InputMethodInfo inputMethodInfo : d()) {
            if (str.equals(inputMethodInfo.getPackageName())) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        InputMethodInfo c = c(this.b.getApplicationContext().getPackageName());
        return c != null && c.getId().equals(Settings.Secure.getString(this.b.getContentResolver(), "default_input_method"));
    }

    public final List k(InputMethodInfo inputMethodInfo) {
        AtomicReference atomicReference = f;
        Map map = (Map) atomicReference.get();
        if (map == null) {
            map = new ConcurrentHashMap();
            atomicReference.set(map);
        }
        List list = (List) map.get(inputMethodInfo.getId());
        if (list != null) {
            return list;
        }
        List<InputMethodSubtype> enabledInputMethodSubtypeList = this.c.getEnabledInputMethodSubtypeList(inputMethodInfo, true);
        if (enabledInputMethodSubtypeList != null) {
            map.put(inputMethodInfo.getId(), enabledInputMethodSubtypeList);
        }
        return enabledInputMethodSubtypeList != null ? enabledInputMethodSubtypeList : Collections.emptyList();
    }

    public final boolean l(String str) {
        List<InputMethodSubtype> k;
        List<InputMethodInfo> d2 = d();
        if (d2 == null || d2.isEmpty()) {
            return false;
        }
        String packageName = this.b.getPackageName();
        for (InputMethodInfo inputMethodInfo : d2) {
            String packageName2 = inputMethodInfo.getPackageName();
            if (packageName2 != null && (TextUtils.isEmpty(str) || packageName2.startsWith(str))) {
                if (!packageName2.equals(packageName) && (k = k(inputMethodInfo)) != null && !k.isEmpty()) {
                    for (InputMethodSubtype inputMethodSubtype : k) {
                        if (!inputMethodSubtype.isAuxiliary()) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }
}
