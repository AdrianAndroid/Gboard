package defpackage;

/* compiled from: PG */
/* renamed from: hok  reason: default package */
/* loaded from: classes.dex */
public enum hok implements ids {
    PROMO_TOOLTIP_DURATION("InlineSuggestion.Tooltip.Display"),
    PROMO_SPACE_TOOLTIP_DURATION("InlineSuggestion.Tooltip.Space.Display"),
    PROMO_TOOLTIP_V2_CHIP_DURATION("InlineSuggestion.Tooltip2.Chip.Display"),
    PROMO_TOOLTIP_V2_DURATION("InlineSuggestion.Tooltip2.Display"),
    PROMO_TOOLTIP_V2_CLICK_DELAY("InlineSuggestion.Tooltip2.Chip.ClickDelay");
    
    private final String g;

    hok(String str) {
        this.g = str;
    }

    @Override // defpackage.idt
    public final /* synthetic */ int a() {
        return -1;
    }

    @Override // defpackage.idt
    public final String b() {
        return this.g;
    }
}
