package defpackage;

import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodSubtype;

/* compiled from: PG */
/* renamed from: jao  reason: default package */
/* loaded from: classes.dex */
public final class jao {
    public final InputMethodInfo a;
    public final InputMethodSubtype b;

    public jao(InputMethodInfo inputMethodInfo, InputMethodSubtype inputMethodSubtype) {
        if (inputMethodInfo != null) {
            this.a = inputMethodInfo;
            this.b = inputMethodSubtype;
            return;
        }
        throw new NullPointerException("Null inputMethodInfo");
    }

    public static jao a(InputMethodInfo inputMethodInfo, InputMethodSubtype inputMethodSubtype) {
        return new jao(inputMethodInfo, inputMethodSubtype);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jao) {
            jao jaoVar = (jao) obj;
            if (this.a.equals(jaoVar.a)) {
                InputMethodSubtype inputMethodSubtype = this.b;
                InputMethodSubtype inputMethodSubtype2 = jaoVar.b;
                if (inputMethodSubtype != null ? inputMethodSubtype.equals(inputMethodSubtype2) : inputMethodSubtype2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        InputMethodSubtype inputMethodSubtype = this.b;
        return hashCode ^ (inputMethodSubtype == null ? 0 : inputMethodSubtype.hashCode());
    }

    public final String toString() {
        String obj = this.a.toString();
        String valueOf = String.valueOf(this.b);
        return "InputMethodInfoSubtypeTuple{inputMethodInfo=" + obj + ", inputMethodSubtype=" + valueOf + "}";
    }

    public jao() {
    }
}
