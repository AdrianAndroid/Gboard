package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Printer;
import com.google.android.inputmethod.latin.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ess  reason: default package */
/* loaded from: classes.dex */
public final class ess implements iss, equ, gzv {
    public final String a;
    public final String b;
    public final eri c;
    public final Set d;
    private final List e;
    private final String f;
    private final boolean g;
    private final lgb h;

    public ess(Context context, eqg eqgVar, int i) {
        this(context, eqgVar, i, itb.h(context));
    }

    public static boolean c(eve eveVar, boolean z) {
        return (eveVar == null || !eveVar.j) ? z : eveVar.g;
    }

    private static void d(List list, Configuration configuration, int i, int i2, int i3) {
        int i4 = configuration.smallestScreenWidthDp;
        int i5 = configuration.orientation;
        if (i4 >= i) {
            list.add(Integer.valueOf(i2));
            if (i5 != 2) {
                return;
            }
            list.add(Integer.valueOf(i3));
        }
    }

    @Override // defpackage.equ
    public final kcq a() {
        return (kcq) this.h.a();
    }

    @Override // defpackage.iss
    public final void b(Context context, Resources.Theme theme) {
        for (Integer num : this.e) {
            itb.e(context.getResources(), num.intValue(), theme);
        }
        erq.a.clear();
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("themeName: ".concat(String.valueOf(this.f)));
        eri eriVar = this.c;
        printer.println("themePackage: ".concat(eriVar == null ? "null" : eriVar.f()));
        boolean z2 = this.g;
        printer.println("isKeyBorderEnabled: " + z2);
        StringBuilder sb = new StringBuilder();
        for (evc evcVar : this.d) {
            sb.append(' ');
            sb.append(evcVar.name());
        }
        printer.println("flavors:".concat(sb.toString()));
        printer.println("resourceCacheKey: ".concat(this.a));
        printer.println("viewStyleCacheKey: ".concat(this.b));
    }

    @Override // defpackage.gzv
    public final /* synthetic */ String getDumpableTag() {
        return hqs.i(this);
    }

    public ess(final Context context, eqg eqgVar, int i, boolean z) {
        final int i2 = i;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        String str = eqgVar.a;
        this.f = str;
        eri b = erj.b(context, eqgVar);
        this.c = b;
        eve e = b != null ? b.e() : null;
        boolean c = c(e, z);
        this.g = c;
        ino M = ino.M(context);
        hashSet.add(evc.b(context.getResources().getInteger(R.integer.f132840_resource_name_obfuscated_res_0x7f0c013e)));
        int i3 = context.getResources().getConfiguration().smallestScreenWidthDp;
        if (i3 >= 768 && i2 != 3) {
            hashSet.add(evc.SW768DP);
        }
        if (i3 >= 600 && i2 != 3) {
            hashSet.add(evc.SW600DP);
        }
        if (i3 >= 400) {
            hashSet.add(evc.SW400DP);
        }
        if (context.getResources().getConfiguration().orientation == 2 && i2 != 3) {
            hashSet.add(evc.LANDSCAPE);
        }
        if (e != null && e.i) {
            hashSet.add(evc.IS_LIGHT);
        }
        if (M.aj(R.string.f160940_resource_name_obfuscated_res_0x7f14067e)) {
            hashSet.add(evc.POPUP);
        } else {
            hashSet.remove(evc.POPUP);
        }
        StringBuilder sb = new StringBuilder("theme");
        itb.d(sb, arrayList, c);
        if (c) {
            hashSet.add(evc.BORDER);
        }
        Configuration configuration = context.getResources().getConfiguration();
        d(arrayList, configuration, 0, R.array.f1200_resource_name_obfuscated_res_0x7f030012, R.array.f1190_resource_name_obfuscated_res_0x7f030011);
        String a = gzq.a(context);
        if (a.equals("foldable")) {
            int i4 = configuration.orientation;
            arrayList.add(Integer.valueOf((int) R.array.f1460_resource_name_obfuscated_res_0x7f03002d));
            if (i4 == 2) {
                arrayList.add(Integer.valueOf((int) R.array.f1450_resource_name_obfuscated_res_0x7f03002c));
            }
        } else {
            d(arrayList, configuration, 300, R.array.f2020_resource_name_obfuscated_res_0x7f03006b, R.array.f2010_resource_name_obfuscated_res_0x7f03006a);
            d(arrayList, configuration, 350, R.array.f1670_resource_name_obfuscated_res_0x7f030046, R.array.f1660_resource_name_obfuscated_res_0x7f030045);
            d(arrayList, configuration, 400, R.array.f1580_resource_name_obfuscated_res_0x7f03003d, R.array.f1570_resource_name_obfuscated_res_0x7f03003c);
            d(arrayList, configuration, 600, R.array.f2060_resource_name_obfuscated_res_0x7f03006f, R.array.f2050_resource_name_obfuscated_res_0x7f03006e);
            d(arrayList, configuration, 768, R.array.f1600_resource_name_obfuscated_res_0x7f03003f, R.array.f1590_resource_name_obfuscated_res_0x7f03003e);
            d(arrayList, configuration, 800, R.array.f1490_resource_name_obfuscated_res_0x7f030032, R.array.f1480_resource_name_obfuscated_res_0x7f030031);
            if (i2 != 1) {
                i2 = i2 == 4 ? 4 : i2;
            }
            if (a.equals("tablet_large")) {
                int i5 = configuration.orientation;
                arrayList.add(Integer.valueOf((int) R.array.f1610_resource_name_obfuscated_res_0x7f030040));
                if (i5 == 2) {
                    arrayList.add(Integer.valueOf((int) R.array.f1620_resource_name_obfuscated_res_0x7f030041));
                }
            }
        }
        float a2 = jam.a(context);
        DisplayMetrics i6 = gvv.i(context);
        float f = (jam.r(context) ? i6.heightPixels : i6.widthPixels) / i6.densityDpi;
        arrayList.add(Integer.valueOf(a2 >= 5.5f ? R.array.f1520_resource_name_obfuscated_res_0x7f030035 : R.array.f1530_resource_name_obfuscated_res_0x7f030036));
        arrayList.add(Integer.valueOf(f >= 2.3f ? R.array.f1540_resource_name_obfuscated_res_0x7f030037 : R.array.f1550_resource_name_obfuscated_res_0x7f030038));
        if (i2 == 2) {
            sb.append("_onehanded");
            arrayList.add(Integer.valueOf((int) R.array.f1730_resource_name_obfuscated_res_0x7f03004c));
        } else if (i2 == 3) {
            boolean k = hyq.k(context);
            sb.append("_floating_keyboard2");
            arrayList.add(Integer.valueOf((int) R.array.f1420_resource_name_obfuscated_res_0x7f030029));
            sb.append(true != k ? "_floating_v2_height" : "_floating_v1_height");
            arrayList.add(Integer.valueOf(true != k ? R.array.f1440_resource_name_obfuscated_res_0x7f03002b : R.array.f1430_resource_name_obfuscated_res_0x7f03002a));
        } else if (i2 == 4) {
            sb.append("_split");
            arrayList.add(Integer.valueOf((int) R.array.f2030_resource_name_obfuscated_res_0x7f03006c));
        }
        if (itb.q(context)) {
            arrayList.add(Integer.valueOf((int) R.array.f1050_resource_name_obfuscated_res_0x7f030003));
            sb.append("_bottom4dp");
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append("_stylesheet");
            arrayList.add(Integer.valueOf((int) R.style.f199050_resource_name_obfuscated_res_0x7f150533));
            if (!itb.k()) {
                sb.append("_noshadow");
            }
            if (!itb.o()) {
                if (itb.m(((Long) itb.f.c()).longValue()) && ((Boolean) itb.d.c()).booleanValue()) {
                    sb.append("_gsans");
                    arrayList.add(Integer.valueOf((int) R.style.f193570_resource_name_obfuscated_res_0x7f1502b9));
                }
            } else {
                sb.append("_pgsans");
                arrayList.add(Integer.valueOf((int) R.style.f193750_resource_name_obfuscated_res_0x7f1502cb));
            }
            if (itb.n()) {
                sb.append("_pillkey");
                if (!c) {
                    arrayList.add(Integer.valueOf((int) R.style.f195950_resource_name_obfuscated_res_0x7f1503c5));
                }
            }
            if (itb.p()) {
                sb.append("_silkpopup");
                arrayList.add(Integer.valueOf((int) R.style.f196200_resource_name_obfuscated_res_0x7f1503e4));
            }
            if (((Boolean) iho.a(context).c()).booleanValue()) {
                sb.append("_navredesign");
            }
        }
        String string = context.getString(R.string.f160030_resource_name_obfuscated_res_0x7f140620);
        String string2 = context.getString(R.string.f160040_resource_name_obfuscated_res_0x7f140621);
        if (str.equals(string) || str.equals(string2)) {
            sb.append("_googleblue");
            arrayList.add(Integer.valueOf((int) R.style.f192550_resource_name_obfuscated_res_0x7f150248));
        }
        if (e != null && e.i) {
            sb.append("_materiallight");
            arrayList.add(Integer.valueOf((int) R.style.f191750_resource_name_obfuscated_res_0x7f1501f1));
        }
        if (str.equals(context.getString(R.string.f160090_resource_name_obfuscated_res_0x7f140626))) {
            sb.append("_materialdark");
            arrayList.add(Integer.valueOf((int) R.style.f191740_resource_name_obfuscated_res_0x7f1501f0));
        }
        String a3 = gzq.a(context);
        sb.append("_");
        sb.append(a3);
        this.a = sb.toString();
        StringBuilder sb2 = new StringBuilder(sb);
        if (a3.equals("phone") || a3.equals("tablet")) {
            int i7 = context.getResources().getConfiguration().smallestScreenWidthDp;
            if (i7 > 800) {
                sb2.append("_800");
            } else if (i7 > 768) {
                sb2.append("_768");
            } else if (i7 > 600) {
                sb2.append("_600");
            } else if (i7 > 400) {
                sb2.append("_400");
            } else if (i7 > 350) {
                sb2.append("_350");
            } else if (i7 > 300) {
                sb2.append("_300");
            }
        }
        if (b == null) {
            sb2.append("_default");
        } else {
            sb2.append('_');
            sb2.append(b.f());
        }
        if (context.getResources().getConfiguration().orientation == 2) {
            sb2.append("_land");
        } else {
            sb2.append("_port");
        }
        this.b = sb2.toString();
        this.h = jdg.n(new lgb() { // from class: esr
            @Override // defpackage.lgb
            public final Object a() {
                ess essVar = ess.this;
                Context context2 = context;
                int i8 = i2;
                eri eriVar = essVar.c;
                if (eriVar != null) {
                    eqw a4 = eqx.a(context2, eriVar, essVar.d);
                    Resources resources = context2.getResources();
                    ArrayList arrayList2 = new ArrayList(10);
                    eqs[] eqsVarArr = new eqs[12];
                    boolean z2 = true;
                    eqsVarArr[0] = new esh(resources, 1);
                    eqsVarArr[1] = new esf(1);
                    eqsVarArr[2] = new esj(resources, eriVar, 1);
                    eqsVarArr[3] = new esf(0);
                    eqsVarArr[4] = new esf(2);
                    eqsVarArr[5] = new esh(resources, 2);
                    eqsVarArr[6] = new esf(4);
                    eqsVarArr[7] = new esj(resources, eriVar, 0);
                    eqsVarArr[8] = new esf(5);
                    eqsVarArr[9] = new esh(resources, 0);
                    if (i8 != 3) {
                        z2 = false;
                    }
                    eqsVarArr[10] = new esl(resources, z2);
                    eqsVarArr[11] = new esf(3);
                    arrayList2.addAll(Arrays.asList(eqsVarArr));
                    return new kcq(a4, arrayList2);
                }
                return null;
            }
        });
        gzt.a.a(this);
    }
}
