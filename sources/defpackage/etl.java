package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: etl  reason: default package */
/* loaded from: classes.dex */
public final class etl {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/theme/listing/ThemeDetailsFragmentPeer");
    public final Context b;
    public final ino c;
    public final idk d;
    public final String e;
    public final int f;
    public eul g;
    public final etq h;
    public boolean i;
    public etk j;
    public View k;
    public final guh l = new etj(this);
    public final ewj m;
    private final boolean n;

    public etl(Context context, ewj ewjVar, idk idkVar, Bundle bundle, Drawable drawable, byte[] bArr) {
        eui h;
        this.b = context;
        this.c = ino.M(context);
        this.m = ewjVar;
        this.d = idkVar;
        String string = bundle.getString("arg_title");
        if (string == null) {
            ((ltd) a.a(hip.a).k("com/google/android/apps/inputmethod/libs/theme/listing/ThemeDetailsFragmentPeer", "getTitle", 376, "ThemeDetailsFragmentPeer.java")).t("Title is null.");
            string = "";
        }
        String str = string;
        this.e = str;
        int i = bundle.getInt("arg_category_type", 0);
        this.f = i;
        int i2 = bundle.getInt("arg_theme_spec_provider_type", 1);
        if (i2 == 1) {
            h = euj.h(context, bundle);
        } else if (i2 == 2) {
            h = new euk(context);
        } else if (i2 == 3) {
            h = new eug(context, bundle.getBoolean("arg_dark_mode_locked_is_light_mode"));
        } else if (i2 == 4) {
            h = new euh(context);
        } else {
            ((ltd) ((ltd) eul.a.c()).k("com/google/android/apps/inputmethod/libs/theme/listing/ThemeListingItemSpec", "createFromBundle", 456, "ThemeListingItemSpec.java")).u("Unknown theme spec provider type: %d", i2);
            h = euj.h(context, bundle);
        }
        eul eulVar = new eul(h);
        this.g = eulVar;
        this.i = eulVar.m(context);
        this.n = this.g.n(context);
        this.h = new etq(context, str, this.g, this.i, drawable);
        idkVar.e(erh.PREVIEWED, this.g.c(context));
        idkVar.e(erh.CATEGORY_PREVIEW_THEME, Integer.valueOf(i));
    }

    public static boolean a(Context context, eul eulVar) {
        return eul.e(context).equals(eulVar);
    }

    public final boolean b() {
        View view = this.k;
        if (view == null) {
            return false;
        }
        Switch r0 = (Switch) view.findViewById(R.id.f129780_resource_name_obfuscated_res_0x7f0b2191);
        if (!this.n) {
            r0.setChecked(this.i);
            r0.setVisibility(0);
            r0.setOnCheckedChangeListener(new aix(this, 4));
            return true;
        }
        r0.setVisibility(8);
        return false;
    }
}
