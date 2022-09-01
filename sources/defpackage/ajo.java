package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextLinks;

/* compiled from: PG */
/* renamed from: ajo  reason: default package */
/* loaded from: classes.dex */
final class ajo extends beh {
    private final TextClassifier a;
    private final beh b;

    public ajo(Context context, TextClassifier textClassifier) {
        nq.g(context);
        nq.g(textClassifier);
        this.a = textClassifier;
        this.b = ajm.a(context);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.beh
    public final ajt b(ajr ajrVar) {
        TextClassifier.EntityConfig create;
        f();
        if (Build.VERSION.SDK_INT >= 28) {
            TextClassifier textClassifier = this.a;
            TextLinks.Request.Builder defaultLocales = new TextLinks.Request.Builder(ajrVar.a).setDefaultLocales(null);
            Object obj = ajrVar.b;
            if (Build.VERSION.SDK_INT >= 29) {
                ajq ajqVar = (ajq) obj;
                create = new TextClassifier.EntityConfig.Builder().setIncludedTypes(ajqVar.c).setExcludedTypes(ajqVar.b).setHints(ajqVar.a).includeTypesFromTextClassifier(true).build();
            } else {
                ajq ajqVar2 = (ajq) obj;
                create = TextClassifier.EntityConfig.create(ajqVar2.a, ajqVar2.c, ajqVar2.b);
            }
            return ajt.a(textClassifier.generateLinks(defaultLocales.setEntityConfig(create).build()), ajrVar.a);
        }
        return this.b.b(ajrVar);
    }
}
