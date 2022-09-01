package defpackage;

import android.util.Printer;
import android.view.View;
import android.view.ViewGroup;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: gzx  reason: default package */
/* loaded from: classes.dex */
public final class gzx implements gzv {
    public View a;

    public gzx() {
        gzt.a.a(this);
    }

    private static void a(Printer printer, boolean z, View view, int i) {
        StringBuilder sb = new StringBuilder();
        String simpleName = view.getClass().getSimpleName();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(" ");
        }
        sb.append("<");
        sb.append(simpleName);
        if (view.getId() != 0 && view.getId() != -1) {
            sb.append(" id=\"@id/");
            view.getContext();
            sb.append("#0x".concat(String.valueOf(Integer.toHexString(view.getId()))));
            sb.append("\"");
        }
        sb.append(String.format(Locale.US, " l=\"%d\" t=\"%d\" w=\"%d\" h=\"%d\"", Integer.valueOf(view.getLeft()), Integer.valueOf(view.getTop()), Integer.valueOf(view.getWidth()), Integer.valueOf(view.getHeight())));
        sb.append(String.format(Locale.US, " visibility=\"%d\"", Integer.valueOf(view.getVisibility())));
        boolean z2 = (view instanceof ViewGroup) && ((ViewGroup) view).getChildCount() > 0;
        if (!z2) {
            sb.append("/>");
        } else {
            sb.append(">");
        }
        printer.println(sb.toString());
        if (!z2) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            a(printer, z, viewGroup.getChildAt(i3), i + 1);
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i4 = 0; i4 < i; i4++) {
            sb2.append(" ");
        }
        sb2.append(String.format(Locale.US, "<%s/>", simpleName));
        printer.println(sb2.toString());
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("View Hierarchy:");
        View view = this.a;
        if (view != null) {
            a(printer, z, view, 0);
        }
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "ViewDumper";
    }
}
