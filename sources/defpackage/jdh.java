package defpackage;

import android.text.Editable;
import android.text.Html;
import org.xml.sax.XMLReader;

/* compiled from: PG */
/* renamed from: jdh  reason: default package */
/* loaded from: classes.dex */
public final class jdh implements Html.TagHandler {
    public final jdj a;
    private int b = 0;

    public jdh(jdj jdjVar) {
        this.a = jdjVar;
    }

    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
        if (jdg.Z("linkable", str)) {
            if (z) {
                int length = editable.length();
                editable.setSpan(new jdg(), length, length, 17);
                return;
            }
            int length2 = editable.length();
            jdg[] jdgVarArr = (jdg[]) editable.getSpans(0, length2, jdg.class);
            int length3 = jdgVarArr.length;
            if (length3 == 0) {
                return;
            }
            jdg jdgVar = jdgVarArr[length3 - 1];
            int spanStart = editable.getSpanStart(jdgVar);
            editable.removeSpan(jdgVar);
            if (spanStart == length2) {
                return;
            }
            int i = this.b;
            this.b = i + 1;
            editable.setSpan(new jdf(this, i), spanStart, length2, 33);
        }
    }
}
