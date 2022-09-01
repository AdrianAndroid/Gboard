package defpackage;

import android.content.Context;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: erm  reason: default package */
/* loaded from: classes.dex */
public enum erm {
    UNKNOWN,
    MATERIAL_DARK,
    MATERIAL_LIGHT,
    GOOGLE_BLUE_LIGHT,
    GOOGLE_BLUE_DARK,
    DYNAMIC_COLOR,
    MATERIAL3_LIGHT,
    MATERIAL3_DARK,
    COLOR_RED,
    COLOR_GREEN,
    COLOR_TEAL,
    COLOR_BLUE,
    COLOR_CYAN,
    COLOR_DEEP_PURPLE,
    COLOR_PINK,
    COLOR_LIGHT_PINK,
    COLOR_SAND,
    COLOR_BROWN,
    COLOR_BLUE_GREY,
    COLOR_BLACK,
    HOLO_BLUE,
    HOLO_WHITE,
    USER_DEFINED,
    SYSTEM,
    DOWNLOADED;
    
    private static llw z;

    public static erm a(Context context) {
        return c(context, eqg.a(context));
    }

    public static erm b(Context context) {
        return c(context, eqg.b(context));
    }

    public static erm c(Context context, eqg eqgVar) {
        llw llwVar;
        String str = eqgVar.a;
        synchronized (erm.class) {
            if (z == null) {
                lls h = llw.h();
                h.a(context.getString(R.string.f160100_resource_name_obfuscated_res_0x7f140627), MATERIAL_LIGHT);
                h.a(context.getString(R.string.f160090_resource_name_obfuscated_res_0x7f140626), MATERIAL_DARK);
                h.a(context.getString(R.string.f160040_resource_name_obfuscated_res_0x7f140621), GOOGLE_BLUE_LIGHT);
                h.a(context.getString(R.string.f160030_resource_name_obfuscated_res_0x7f140620), GOOGLE_BLUE_DARK);
                h.a(context.getString(R.string.f160020_resource_name_obfuscated_res_0x7f14061f), DYNAMIC_COLOR);
                h.a(context.getString(R.string.f160080_resource_name_obfuscated_res_0x7f140625), MATERIAL3_LIGHT);
                h.a(context.getString(R.string.f160070_resource_name_obfuscated_res_0x7f140624), MATERIAL3_DARK);
                h.a(context.getString(R.string.f159990_resource_name_obfuscated_res_0x7f14061c), COLOR_RED);
                h.a(context.getString(R.string.f159960_resource_name_obfuscated_res_0x7f140619), COLOR_GREEN);
                h.a(context.getString(R.string.f160010_resource_name_obfuscated_res_0x7f14061e), COLOR_TEAL);
                h.a(context.getString(R.string.f159910_resource_name_obfuscated_res_0x7f140614), COLOR_BLUE);
                h.a(context.getString(R.string.f159940_resource_name_obfuscated_res_0x7f140617), COLOR_CYAN);
                h.a(context.getString(R.string.f159950_resource_name_obfuscated_res_0x7f140618), COLOR_DEEP_PURPLE);
                h.a(context.getString(R.string.f159980_resource_name_obfuscated_res_0x7f14061b), COLOR_PINK);
                h.a(context.getString(R.string.f159970_resource_name_obfuscated_res_0x7f14061a), COLOR_LIGHT_PINK);
                h.a(context.getString(R.string.f160000_resource_name_obfuscated_res_0x7f14061d), COLOR_SAND);
                h.a(context.getString(R.string.f159930_resource_name_obfuscated_res_0x7f140616), COLOR_BROWN);
                h.a(context.getString(R.string.f159920_resource_name_obfuscated_res_0x7f140615), COLOR_BLUE_GREY);
                h.a(context.getString(R.string.f159900_resource_name_obfuscated_res_0x7f140613), COLOR_BLACK);
                h.a(context.getString(R.string.f160050_resource_name_obfuscated_res_0x7f140622), HOLO_BLUE);
                h.a(context.getString(R.string.f160060_resource_name_obfuscated_res_0x7f140623), HOLO_WHITE);
                z = h.l();
            }
            llwVar = z;
        }
        erm ermVar = (erm) llwVar.get(str);
        return ermVar != null ? ermVar : erj.k(str) ? USER_DEFINED : !erj.i(str) ? str.startsWith("system:") ? SYSTEM : UNKNOWN : DOWNLOADED;
    }
}
