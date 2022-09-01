package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: ead  reason: default package */
/* loaded from: classes.dex */
public final class ead {
    public final ats a;
    public final String b;
    public final int c;

    public ead(ats atsVar, String str, int i) {
        if (atsVar != null) {
            this.a = atsVar;
            if (str != null) {
                this.b = str;
                this.c = i;
                return;
            }
            throw new NullPointerException("Null contentDescription");
        }
        throw new NullPointerException("Null drawableRequest");
    }

    public static ead a(Context context) {
        return new ead((ats) ((ats) hjq.a(context).g(eaa.a).u()).G(context.getResources().getDimensionPixelSize(R.dimen.f33630_resource_name_obfuscated_res_0x7f070152)), context.getResources().getString(R.string.f150870_resource_name_obfuscated_res_0x7f1401cd), context.getResources().getInteger(R.integer.f131220_resource_name_obfuscated_res_0x7f0c0021));
    }

    public static ead b(Context context, Throwable th) {
        ats atsVar;
        int i;
        int i2;
        if (th instanceof NoSuchElementException) {
            atsVar = (ats) ((ats) hjq.a(context).g(eaa.b).A()).G(context.getResources().getDimensionPixelSize(R.dimen.f33640_resource_name_obfuscated_res_0x7f070153));
            i = R.string.f150880_resource_name_obfuscated_res_0x7f1401ce;
            i2 = R.integer.f131230_resource_name_obfuscated_res_0x7f0c0022;
        } else {
            atsVar = (ats) ((ats) hjq.a(context).h(Integer.valueOf((int) R.drawable.quantum_gm_ic_cloud_off_vd_theme_24)).A()).G(context.getResources().getDimensionPixelSize(R.dimen.f33630_resource_name_obfuscated_res_0x7f070152));
            i = R.string.f150860_resource_name_obfuscated_res_0x7f1401cc;
            i2 = R.integer.f131220_resource_name_obfuscated_res_0x7f0c0021;
        }
        return new ead(atsVar, context.getResources().getString(i), context.getResources().getInteger(i2));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ead) {
            ead eadVar = (ead) obj;
            if (this.a.equals(eadVar.a) && this.b.equals(eadVar.b) && this.c == eadVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        String obj = this.a.toString();
        String str = this.b;
        int i = this.c;
        return "EmojiKitchenMixStatus{drawableRequest=" + obj + ", contentDescription=" + str + ", alpha=" + i + "}";
    }

    public ead() {
    }
}
