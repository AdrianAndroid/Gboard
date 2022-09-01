package defpackage;

import android.view.textclassifier.TextLinks;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executors;

/* compiled from: PG */
@Deprecated
/* renamed from: ajt  reason: default package */
/* loaded from: classes.dex */
public final class ajt {
    public final List a;
    private final CharSequence b;

    static {
        Executors.newFixedThreadPool(1);
        new ajn(0);
    }

    public ajt(CharSequence charSequence, List list) {
        this.b = charSequence;
        this.a = Collections.unmodifiableList(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ajt a(TextLinks textLinks, CharSequence charSequence) {
        nq.g(textLinks);
        nq.g(charSequence);
        Collection<TextLinks.TextLink> links = textLinks.getLinks();
        String obj = charSequence.toString();
        nq.g(obj);
        ArrayList arrayList = new ArrayList();
        for (TextLinks.TextLink textLink : links) {
            int start = textLink.getStart();
            int end = textLink.getEnd();
            nq.g(textLink);
            int entityCount = textLink.getEntityCount();
            qo qoVar = new qo(entityCount);
            for (int i = 0; i < entityCount; i++) {
                String entity = textLink.getEntity(i);
                qoVar.put(entity, Float.valueOf(textLink.getConfidenceScore(entity)));
            }
            beh.e(start, end, qoVar, arrayList);
        }
        return beh.d(obj, arrayList);
    }

    public final String toString() {
        return String.format(Locale.US, "TextLinks{fullText=%s, links=%s}", this.b, this.a);
    }
}
