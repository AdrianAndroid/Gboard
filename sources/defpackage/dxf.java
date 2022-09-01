package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.AppCompatTextView;
import android.text.Editable;
import android.text.Html;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.inputmethod.latin.R;
import j$.util.Objects;
import j$.util.function.BiConsumer;
import j$.util.function.Consumer;
import java.util.List;
import java.util.Map;
import org.xml.sax.XMLReader;

/* compiled from: PG */
/* renamed from: dxf  reason: default package */
/* loaded from: classes.dex */
public final class dxf implements Html.TagHandler {
    public static final /* synthetic */ int a = 0;
    private static final llw c;
    private static final llw d;
    private static final llw e;
    private final oiy g;
    private final llw h;
    private final llw i;
    private final boolean j;
    private final opu k;
    private static final ltg b = ltg.j("com/google/android/apps/inputmethod/libs/nga/util/StyledTextTagHandler");
    private static final lfy f = lfy.c('-').h().b();

    static {
        lls h = llw.h();
        h.a("voice", Integer.valueOf((int) R.id.f66680_resource_name_obfuscated_res_0x7f0b0805));
        h.a("promo", Integer.valueOf((int) R.id.f66660_resource_name_obfuscated_res_0x7f0b0803));
        h.a("accented", Integer.valueOf((int) R.id.f66570_resource_name_obfuscated_res_0x7f0b07fa));
        c = h.l();
        lls h2 = llw.h();
        h2.a("helpcenterlink", dug.f);
        d = h2.l();
        lls h3 = llw.h();
        h3.a("assistantsettings", dxc.b);
        h3.a("androidsettings", dxc.a);
        e = h3.l();
    }

    public dxf(oiy oiyVar, llw llwVar, llw llwVar2, opu opuVar, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.g = oiyVar;
        this.h = llwVar;
        this.i = llwVar2;
        this.k = opuVar;
        this.j = z;
    }

    public static dxf b(Context context) {
        return e(context, c, d);
    }

    public static dxf c(Context context, llw llwVar) {
        lls h = llw.h();
        h.j(d);
        h.j(llwVar);
        return e(context, c, h.l());
    }

    private static ClickableSpan d(Consumer consumer) {
        return new dxd(consumer);
    }

    private static dxf e(Context context, llw llwVar, llw llwVar2) {
        doc docVar = null;
        View inflate = LayoutInflater.from(context).inflate(R.layout.f143690_resource_name_obfuscated_res_0x7f0e0481, (ViewGroup) null);
        lls h = llw.h();
        lsz it = llwVar.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            AppCompatTextView appCompatTextView = (AppCompatTextView) inflate.findViewById(((Integer) entry.getValue()).intValue());
            if (appCompatTextView == null) {
                ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/nga/util/StyledTextTagHandler", "of", 112, "StyledTextTagHandler.java")).w("Missing view element to theme tag %s", str);
            } else {
                h.a(str, new doc(appCompatTextView, 8));
            }
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) inflate.findViewById(R.id.f66600_resource_name_obfuscated_res_0x7f0b07fd);
        if (appCompatTextView2 == null) {
            ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/nga/util/StyledTextTagHandler", "of", 121, "StyledTextTagHandler.java")).t("Missing link view element");
        } else {
            docVar = new doc(appCompatTextView2, 9);
        }
        return new dxf(docVar, h.l(), llwVar2, new opu(context.getResources()), ((AppCompatTextView) inflate.findViewById(R.id.f66650_resource_name_obfuscated_res_0x7f0b0802)).getTextColors().getDefaultColor() == ((AppCompatTextView) inflate.findViewById(R.id.f66570_resource_name_obfuscated_res_0x7f0b07fa)).getTextColors().getDefaultColor(), null, null, null);
    }

    private static void f(String str, int i, String str2) {
        String str3;
        ltd ltdVar = (ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/nga/util/StyledTextTagHandler", "reportMismatchedTag", 257, "StyledTextTagHandler.java");
        Integer valueOf = Integer.valueOf(i);
        if (str2 != null) {
            str3 = "<" + str2 + ">";
        } else {
            str3 = "nothing";
        }
        ltdVar.J("Unable to find matching start for closing tag, </%s> at position %s -  found %s", str, valueOf, str3);
    }

    public final Spanned a(String str) {
        return Html.fromHtml(String.format("<html>%s</html>", str), null, this);
    }

    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
        final BiConsumer biConsumer;
        oiy oiyVar = (oiy) this.h.get(str);
        List k = f.k(str);
        Consumer consumer = (Consumer) this.i.get(str);
        if (oiyVar == null && (consumer != null || (k.size() > 1 && e.containsKey(k.get(0))))) {
            oiyVar = this.g;
        }
        if (oiyVar == null) {
            return;
        }
        if (z) {
            int length = editable.length();
            editable.setSpan(new dxe(str), length, length, 17);
            return;
        }
        int length2 = editable.length();
        dxe[] dxeVarArr = (dxe[]) editable.getSpans(0, length2, dxe.class);
        int length3 = dxeVarArr.length;
        if (length3 == 0) {
            f(str, length2, null);
            return;
        }
        dxe dxeVar = dxeVarArr[length3 - 1];
        if (!((String) dxeVar.a).equals(str)) {
            f(str, length2, (String) dxeVar.a);
            return;
        }
        int spanStart = editable.getSpanStart(dxeVar);
        editable.removeSpan(dxeVar);
        if (str.equals("voice")) {
            String string = ((Resources) this.k.a).getString(R.string.f158980_resource_name_obfuscated_res_0x7f14058a, editable.subSequence(spanStart, length2));
            editable.replace(spanStart, length2, string);
            length2 = string.length() + spanStart;
        }
        if (consumer != null) {
            editable.setSpan(d(consumer), spanStart, length2, 33);
        }
        if (str.equals("accented") && this.j) {
            editable.setSpan(new UnderlineSpan(), spanStart, length2, 33);
        }
        if (k.size() > 1 && (biConsumer = (BiConsumer) e.get(k.get(0))) != null) {
            final String str2 = (String) k.get(1);
            editable.setSpan(d(new Consumer() { // from class: dxb
                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    BiConsumer biConsumer2 = BiConsumer.this;
                    String str3 = str2;
                    int i = dxf.a;
                    biConsumer2.accept((Context) obj, str3);
                }

                @Override // j$.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return Objects.requireNonNull(consumer2);
                }
            }), spanStart, length2, 33);
        }
        editable.setSpan(new ForegroundColorSpan(((Integer) oiyVar.a()).intValue()), spanStart, length2, 33);
    }
}
