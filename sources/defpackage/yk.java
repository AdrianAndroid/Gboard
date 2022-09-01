package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* compiled from: PG */
/* renamed from: yk  reason: default package */
/* loaded from: classes2.dex */
final class yk implements yj {
    private final ClipData a;
    private final int b;
    private final int c;
    private final Uri d;
    private final Bundle e;

    public yk(yh yhVar) {
        ClipData clipData = yhVar.a;
        nq.g(clipData);
        this.a = clipData;
        this.b = yhVar.b;
        this.c = yhVar.c;
        this.d = yhVar.d;
        this.e = yhVar.e;
    }

    @Override // defpackage.yj
    public final int a() {
        return this.c;
    }

    @Override // defpackage.yj
    public final int b() {
        return this.b;
    }

    @Override // defpackage.yj
    public final ClipData c() {
        return this.a;
    }

    @Override // defpackage.yj
    public final ContentInfo d() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
        sb.append(this.a.getDescription());
        sb.append(", source=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD");
        sb.append(", flags=");
        sb.append(1 != this.c ? "0" : "FLAG_CONVERT_TO_PLAIN_TEXT");
        String str2 = "";
        if (this.d == null) {
            str = str2;
        } else {
            str = ", hasLinkUri(" + this.d.toString().length() + ")";
        }
        sb.append(str);
        if (this.e != null) {
            str2 = ", hasExtras";
        }
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
