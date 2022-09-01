package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.inputmethod.EditorInfo;

/* compiled from: PG */
/* renamed from: iql  reason: default package */
/* loaded from: classes.dex */
public final class iql {
    public static final hhl a;
    private static final iqe b;

    static {
        hhl h = hhq.h("image_share_intent_whitelist", "app.buzz.share,com.android.messaging,com.android.mms,com.badoo.mobile,com.facebook.mlite,com.facebook.orca,com.google.android.apps.docs,com.google.android.apps.messaging,com.google.android.talk,com.imo.android.imoim,com.kakao.talk,com.motorola.messaging,com.oneplus.mms,com.random.chat.app,com.samsung.android.messaging,com.skype.raider,com.snapchat.android,com.tencent.mm,com.twitter.android,com.viber.voip,com.vkontakte.android,com.whatsapp,com.zing.zalo,jp.naver.line.android,ru.ok.android");
        a = h;
        b = iqe.e(h, 2);
    }

    public static boolean a(EditorInfo editorInfo) {
        return ham.z(b, editorInfo);
    }

    public static boolean b(Context context, Uri uri, String str, String str2) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(str);
        intent.setFlags(268435457);
        intent.setPackage(str2);
        intent.putExtra("android.intent.extra.STREAM", uri);
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
            return true;
        }
        return false;
    }
}
