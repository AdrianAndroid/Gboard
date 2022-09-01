package defpackage;

/* compiled from: PG */
/* renamed from: hsp  reason: default package */
/* loaded from: classes.dex */
public enum hsp implements ido {
    IMS_CREATED_BEFORE_USER_UNLOCKED,
    IMS_CREATED_AFTER_USER_UNLOCKED,
    IMS_INPUT_VIEW_CREATED,
    IMS_ON_START_INPUT_VIEW,
    IMS_INPUT_VIEW_STARTED,
    IMS_INPUT_VIEW_FINISHED,
    IMS_INPUT_STARTED,
    IMS_INPUT_FINISHED,
    IMS_DESTROYED,
    GIMS_RAW_CHARACTERS_SENT,
    IMS_INPUT_STARTED_IC_TYPE,
    IMS_ON_START_INPUT_VIEW_IC_TYPE,
    KEYBOARD_BODY_SHOWN,
    IMS_ON_SHOW_INPUT_REQUESTED;

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return 1000;
    }

    @Override // defpackage.idt
    public final String b() {
        return "";
    }

    @Override // defpackage.ido
    public final /* synthetic */ boolean c() {
        return true;
    }
}
