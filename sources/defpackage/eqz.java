package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: eqz  reason: default package */
/* loaded from: classes.dex */
public final class eqz {
    private static final lmz a = lmz.w(".key", ".key.dark", ".key.action", ".key.bordered", ".key.dark.bordered", ".key.action.bordered", ".space_bar");
    private static final llp b = llp.r(era.m(euu.BACKGROUND_COLOR, eut.j, ".body", ".header_bottom_separator", ".header_tab", ".header", ".candidates"));
    private static final llw c;

    static {
        lls i = llw.i(8);
        i.a(".background", ".keyboard-background");
        i.a(".simplified_preview_background", ".keyboard-background.for-preview");
        i.a(".body", ".keyboard-body-area");
        i.a(".header", ".keyboard-header-area");
        i.a(".candidates", ".candidates-area");
        i.a(".more_candidates", ".candidates-area.expanded");
        i.a(".header_tab", ".tab.in-keyboard-header-area");
        i.a(".header_bottom_separator", ".divider.horizontal.bottom.for-keyboard-header-area");
        c = i.l();
    }

    public static eqy a(Context context, String str, int i) {
        Object erxVar;
        ArrayList arrayList = new ArrayList();
        if (i <= 1) {
            arrayList.addAll(Arrays.asList(new ery(a, 2), new ery(b, 0), new ery(c, 3), new erz(), new erw(), new esb()));
        } else if (i == 2) {
            arrayList.addAll(Arrays.asList(new ery(c, 3), new erz(), new erw(), new esb()));
        }
        if (str.startsWith("com.mi.gboard.")) {
            arrayList.add(esc.a(context, str));
        } else if (str.startsWith("com.oppo.gboard.")) {
            if ("com.oppo.gboard.20180214".equals(str)) {
                erxVar = new esa(context, "style_sheet_oppo_override.binarypb", 0);
            } else {
                erxVar = new erx();
            }
            arrayList.add(erxVar);
        } else if (str.contains("gradient_light")) {
            arrayList.add(!str.startsWith("com.google.gboard.20181009.gradient_light") ? new erx() : new ery(new eqy[]{new esa(context, "style_sheet_gradient_light_override.binarypb", 0), new esa(evc.BORDER, new esa(context, "style_sheet_gradient_light_border_override.binarypb", 0), 1)}, 1));
        } else if (str.contains("gradient_dark")) {
            arrayList.add(!str.startsWith("com.google.gboard.20181009.gradient_dark") ? new erx() : new ery(new eqy[]{new esa(context, "style_sheet_gradient_dark_override.binarypb", 0), new esa(evc.BORDER, new esa(context, "style_sheet_gradient_dark_border_override.binarypb", 0), 1)}, 1));
        }
        return arrayList.isEmpty() ? new erx() : new ery((eqy[]) arrayList.toArray(new eqy[arrayList.size()]), 1);
    }
}
